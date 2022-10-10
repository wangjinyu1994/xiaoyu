package com.xiaoyu.provider.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.provider.entity.Dept;
import com.xiaoyu.provider.service.AccountService;
import com.xiaoyu.provider.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * WJY
 */
@RestController
@Slf4j
public class DeptController {


    @Autowired
    private DeptService deptService;
    @Autowired
    private AccountService accountService;

    @Value("${server.port}")
    private String serverPort;
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") int id) {
        return deptService.get(id);
    }
    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.selectAll();
    }

    @PostMapping(value = "/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        int aa = accountService.decrease(userId,money);
        return CommonResult.success(aa);
    }


}
