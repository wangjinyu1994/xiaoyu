package com.xiaoyu.provider.system.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.nacos.common.utils.CollectionUtils;
import com.xiaoyu.common.base.constants.SysDisableIpSigEnum;
import com.xiaoyu.common.base.util.RedisUtils;
import com.xiaoyu.provider.system.dao.ex.XtdljkxxbMapperEx;
import com.xiaoyu.provider.system.dao.ex.XthbmdxxbMapperEx;
import com.xiaoyu.provider.system.entity.Xthbmdxxb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * WJY
 * 将黑名单和登录相关接口放到redis中去
 */
@Component
@Order(value = 1)
public class MyApplicationRunner implements ApplicationRunner {

    @Autowired
    private RedisUtils redisUtils;
    @Autowired
    private XthbmdxxbMapperEx xthbmdxxbMapperEx;
    @Autowired
    private XtdljkxxbMapperEx xtdljkxxbMapperEx;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> xthbmdxxbs = getXthbmdxxbInfo();
        if (redisUtils.hasKey(SysDisableIpSigEnum.XIAOYU_HMD.getCode())){
            redisUtils.del(SysDisableIpSigEnum.XIAOYU_HMD.getCode());
        }
        if (CollectionUtils.isNotEmpty(xthbmdxxbs)){
            String str = JSON.toJSONString(xthbmdxxbs.toString());
            redisUtils.set(SysDisableIpSigEnum.XIAOYU_HMD.getCode(),str);
        }
        List<String> xtdljkxxbs = getXtdljkxxbInfo();
        if (redisUtils.hasKey(SysDisableIpSigEnum.XIAOYU_DLJK.getCode())){
            redisUtils.del(SysDisableIpSigEnum.XIAOYU_DLJK.getCode());
        }
        if (CollectionUtils.isNotEmpty(xtdljkxxbs)){
            String str = JSON.toJSONString(xtdljkxxbs.toString());
            redisUtils.set(SysDisableIpSigEnum.XIAOYU_DLJK.getCode(),str);
        }
    }

    /**
     * 获取到所有的黑名单
     */
    private List<String> getXthbmdxxbInfo(){
        List<String> list = xthbmdxxbMapperEx.getXthbmdxxbInfo();
        return list;
    }

    /**
     * 获取到所有登录相关的接口
     */
    private List<String> getXtdljkxxbInfo(){
        List<String> list = xtdljkxxbMapperEx.getXtdljkxxbInfo();
        return list;
    }
}
