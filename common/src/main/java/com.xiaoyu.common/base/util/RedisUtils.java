package com.xiaoyu.common.base.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * WJY
 */
@Repository
public class RedisUtils {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    /**
     * 查找匹配的key值，返回Set集合
     */
    public Set<String> keys(String key){
        return redisTemplate.keys(key);
    }

    /**
     * 指定缓存失效时间
     * @param key 键
     * @param time 时间（秒）
     */
    public boolean expire(String key, long time){
        if (time > 0){
            redisTemplate.expire(key,time, TimeUnit.SECONDS);
        }
        return true;
    }

    /**
     * 根据key 获取过期时间
     * @param key 键
     */
    public long getExpire(String key){
        return redisTemplate.getExpire(key, TimeUnit.SECONDS);
    }

    /**
     *  判断key是否存在
     * @param key 键
     */
    public boolean hasKey(String key){
        return redisTemplate.hasKey(key);
    }

    /**
     * 删除缓存
     * @param key 键 可以传入一个或多个值
     */
    public void del(String...key){
        if (StringUtils.isNoneBlank(key)){
            redisTemplate.delete((Collection<String>) CollectionUtils.arrayToList(key));
        }
    }

    /**
     *  获取普通缓存
     * @param key 键
     * @return 值
     */
    public Object get(String key){
        return key == null ? null :  redisTemplate.opsForValue().get(key);
    }

    /**
     *  存放普通缓存
     * @param key 键
     * @param value 值
     */
    public boolean set(String key,String value){
        redisTemplate.opsForValue().set(key,value);
        return true;
    }

    /**
     *   存放普通缓存并设置时间
     * @param key 键
     * @param value 值
     * @param time 时间（秒）time要大于0 如果time小于等于0 将设置无限期
     */
    public boolean set(String key,String value,long time){
        if (time > 0){
            redisTemplate.opsForValue().set(key,value,time,TimeUnit.SECONDS);
        } else {
            set(key,value);
        }
        return true;
    }

    /**
     * 递增仅适用于value是数字的值，如果不存在就创建
     * @param key 键
     * @param delta 值
     * @return 递增后的值
     */
    public long incr(String key,long delta){
        return redisTemplate.opsForValue().increment(key, delta);
    }

    /**
     * 递减仅适用于value是数字的值，如果不存在就创建
     * @param key 键
     * @param delta 值
     * @return 递减后的值
     */
    public long decr(String key,long delta){
        return redisTemplate.opsForValue().increment(key, -delta);
    }

    /**
     * 获取变量中Hash的指定键值，不存在则返回null
     * @param key 键 不能为null
     * @param item 项 不能为null
     */
    public Object hget(String key,String item){
        return redisTemplate.opsForHash().get(key,item);
    }

    /**
     * 获取变量中Hash的指定键值，不存在则返回null
     * @param key 键 不能为null
     * @param item 项 不能为null
     * @param defaultValue 指定默认值
     */
    public Object hget(String key, String item, Object defaultValue){
        Object result = redisTemplate.opsForHash().get(key,item);
        if (Objects.isNull(result)){
            redisTemplate.opsForHash().put(key,item,defaultValue);
            return defaultValue;
        }
        return result;
    }

    /**
     * 获取hashKey对应的所有键值
     * @param key 键
     * @return 对应的多个键值
     */
    public Map<Object,Object> hmget(String key){
        return redisTemplate.opsForHash().entries(key);
    }

    /**
     * HashSet
     * 以Map集合的形式添加键值对，整个map将作为一个redis中的hash结构，被命名为key。
     * @param key 键
     * @param map 对应多个键值
     */
    public boolean hmset(String key, Map<String, Object> map){
        redisTemplate.opsForHash().putAll(key,map);
        return true;
    }

    /**
     * HashSet 并设置时间
     * 将Map集合映射为redis中的一个Hash结构，变量名为key，并设置过期时间
     * @param key  键
     * @param map  对应多个键值
     * @param time 时间(秒)
     */
    public boolean hmset(String key, Map<String, Object> map,long time){
        hmset(key,map);
        if (time > 0){
            expire(key,time);
        }
        return true;
    }

    /**
     * 向一张hash表中放入数据,如果不存在将创建
     * 向一张Hash表存入数据，并设置过期时间(覆盖设置)
     * @param key   键
     * @param item  项
     * @param value 值
     * @param time  时间(秒) 注意:如果已存在的hash表有时间,这里将会替换原有的时间
     */
    public boolean hset(String key, String item, Object value, long time){
        redisTemplate.opsForHash().put(key,item,value);
        if (time > 0){
            expire(key,time);
        }
        return true;
    }

    /**
     * 删除hash表中的值
     * 删除变量key中的键值对，可传入多个键
     * @param key  键 不能为null
     * @param item 项 可以使多个 不能为null
     */
    public void hdel(String key,Object...item){
        redisTemplate.opsForHash().delete(key,item);
    }

    /**
     * 判断hash表中是否有该项的值
     * @param key  键 不能为null
     * @param item 项 不能为null
     */
    public boolean hHasKey(String key, String item){
        return redisTemplate.opsForHash().hasKey(key,item);
    }

    /**
     * hash递增 如果不存在,就会创建一个 并把新增后的值返回
     * 使变量中的键以dobule值的大小进行增长
     * @param key  键
     * @param item 项
     * @param by   要增加几(大于0)
     */
    public double hincr(String key,String item,double by){
        return redisTemplate.opsForHash().increment(key,item,by);
    }

    /**
     * hash递减 如果不存在,就会创建一个 并把减少后的值返回
     * 使变量中的键以dobule值的大小进行减少
     * @param key  键
     * @param item 项
     * @param by   要减少的值
     */
    public double hdncr(String key,String item,double by){
        return redisTemplate.opsForHash().increment(key,item,-by);
    }

    /**
     * 根据key获取set中所有的值
     */
    public Set<Object> sGet(String key){
        return redisTemplate.opsForSet().members(key);
    }

    /**
     * 查询该值在set中是否存在
     * @param key 键
     * @param value 值
     */
    public boolean sHasKey(String key,Object value){
        return redisTemplate.opsForSet().isMember(key,value);
    }

    /**
     * 将数据放入set缓存
     * @param key 键
     * @param values 值 可放多个
     * @return 成功个数
     */
    public long setSet(String key,Object...values){
        return redisTemplate.opsForSet().add(key,values);
    }

    /**
     *
     * @param key 键
     * @param tiem 时间（秒）
     * @param values 值 可放多个
     * @return 成功个数
     */
    public long setSetAndTime(String key,long tiem,Object...values){
        long count = setSet(key,values);
        if (tiem > 0){
            expire(key,tiem);
        }
        return count;
    }

    /**
     * 获取set缓存长度
     * @param key 键
     */
    public long setGetSetSize(String key){
        return redisTemplate.opsForSet().size(key);
    }

    /**
     * 移除值为value的
     * @param key 键
     * @param values 值 可放多个
     * @return 成功的个数
     */
    public long setRemove(String key, Object... values){
        return redisTemplate.opsForSet().remove(key,values);
    }

    /**
     * 获取list缓存的内容
     * @param key 键
     * @param start 开始
     * @param end 结束 0 到 -1代表所有值
     */
    public List<Object> listGet(String key, long start, long end){
        return redisTemplate.opsForList().range(key,start,end);
    }

    /**
     * 获取list集合的长度
     * @param key 键
     */
    public long lGetListSize(String key){
        return redisTemplate.opsForList().size(key);
    }

    /**
     * 通过索引 获取list中的值
     * @param key   键
     * @param index 索引 index>=0时， 0 表头，1 第二个元素，依次类推；index<0时，-1，表尾，-2倒数第二个元素，依次类推
     */
    public Object lGetIndex(String key, long index){
        return redisTemplate.opsForList().index(key,index);
    }

    /**
     * 向指定list变量右边添加元素
     * @param key 键
     * @param value 值
     */
    public boolean listRightPush(String key, Object value){
        redisTemplate.opsForList().rightPush(key,value);
        return true;
    }

    /**
     * 向指定list变量右边添加元素并设置过期时间
     * @param key 键
     * @param value 值
     * @param time 时间（秒）
     */
    public boolean listSet(String key, Object value,long time){
        listRightPush(key,value);
        if (time > 0){
            expire(key,time);
        }
        return true;
    }

    /**
     * 将list放入缓存
     * @param key 键
     * @param value 值
     */
    public boolean listRightPushAll(String key,List<Object> value){
        redisTemplate.opsForList().rightPushAll(key,value);
        return true;
    }

    /**
     * List，value1右侧放入，如果没有value1则不放入
     * @param key    键
     * @param value1 值
     * @param value2 值
     */
    public long listRightPush(String key, Object value1, Object value2) {
        Long num = redisTemplate.opsForList().rightPush(key, value1, value2);
        if (null == num) {
            return 0;
        }
        return num;
    }

    /**
     * List，右侧放入，key值必须存在
     * @param key   键
     * @param value 值
     */
    public long listRightPushIfPresent(String key, Object value) {
        Long num = redisTemplate.opsForList().rightPushIfPresent(key, value);
        if (null == num) {
            return 0;
        }
        return num;
    }

    /**
     * 向list集合左侧放入数据
     * @param key 键
     * @param value 值
     */
    public long listLeftPush(String key, Object value){
        Long num = redisTemplate.opsForList().leftPush(key,value);
        if (null == null){
            return 0;
        }
        return num;
    }

    /**
     * List，左侧放入，多个
     * @param key 键
     * @param values 值
     */
    public long listLeftPushAll(String key,List<Object> values){
        Long num = redisTemplate.opsForList().leftPushAll(key, values);
        if (null == num) {
            return 0;
        }
        return num;
    }

    /**
     * List，左侧放入，当key存在的时候
     * @param key   键
     * @param value 值
     */
    public long listLeftPushIfPresent(String key, Object value){
        Long num = redisTemplate.opsForList().leftPushIfPresent(key, value);
        if (null == num) {
            return 0;
        }
        return num;
    }

    /**
     * List，value1左侧放入，没有value1则不放入
     * @param key    键
     * @param value1 值1
     * @param value2 值2
     */
    public long listLeftPush(String key, Object value1, Object value2) {
        Long num = redisTemplate.opsForList().leftPush(key, value1, value2);
        if (null == num) {
            return 0;
        }
        return num;
    }

    /**
     * 根据索引修改list中的某条数据
     * @param key 键
     * @param index 下标
     * @param value 值
     */
    public boolean listUpdateIndex(String key, long index, Object value){
        redisTemplate.opsForList().set(key,index,value);
        return true;
    }

    /**
     * 移除N个值为value
     * @param key 键
     * @param count 移除个数
     * @param value 值
     */
    public long listRemove(String key, long count, Object value){
        return redisTemplate.opsForList().remove(key,count,value);
    }
}
