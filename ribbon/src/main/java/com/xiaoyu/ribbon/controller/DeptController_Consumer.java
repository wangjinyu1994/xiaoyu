package com.xiaoyu.ribbon.controller;

import com.xiaoyu.ribbon.entity.Dept;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * WJY
 */
@RestController
public class DeptController_Consumer {

    @Resource
    private RestTemplate restTemplate;

    /*@Value("${service-url.nacos-user-service}")
    private String serverURL; //服务提供者的服务名*/

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id) {
        return restTemplate.getForObject("http://provider-test" + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject("http://provider-test" + "/dept/list", List.class);
    }

}
