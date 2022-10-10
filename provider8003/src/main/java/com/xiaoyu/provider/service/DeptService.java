package com.xiaoyu.provider.service;

import com.xiaoyu.provider.entity.Dept;

import java.util.List;

/**
 * WJY
 */
public interface DeptService {

    Dept get(Integer deptNo);
    List<Dept> selectAll();

}
