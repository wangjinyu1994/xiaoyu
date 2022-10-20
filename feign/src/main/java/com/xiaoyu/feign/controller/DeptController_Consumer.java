package com.xiaoyu.feign.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.feign.entity.Dept;
import com.xiaoyu.feign.service.DeptFeignService;
import com.xiaoyu.feign.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * WJY
 */
@RestController
public class DeptController_Consumer {

    @Resource
    private DeptFeignService deptFeignService;
    @Resource
    private TestService testService;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id) {
        return deptFeignService.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        System.out.println("***************************************");
        return deptFeignService.list();
    }

    @GetMapping("/test")
    public CommonResult test(){
        return testService.test();
    }

}
