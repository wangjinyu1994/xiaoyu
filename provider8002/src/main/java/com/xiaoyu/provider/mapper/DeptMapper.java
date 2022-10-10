package com.xiaoyu.provider.mapper;

import com.xiaoyu.provider.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * WJY
 */
@Mapper
public interface DeptMapper {

    //根据主键获取数据
    Dept selectByPrimaryKey(Integer deptNo);
    //获取表中的全部数据
    List<Dept> GetAll();

}
