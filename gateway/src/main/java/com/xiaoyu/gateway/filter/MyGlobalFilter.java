package com.xiaoyu.gateway.filter;

import com.alibaba.fastjson.JSONObject;
import com.xiaoyu.common.base.constants.SysConstantsEnum;
import com.xiaoyu.common.base.constants.SysDisableIpSigEnum;
import com.xiaoyu.common.base.util.RedisUtils;
import com.xiaoyu.gateway.util.ServerHttpRequestUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * WJY
 */
@Component
@Slf4j
public class MyGlobalFilter implements GlobalFilter, Ordered {

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest serverHttpRequest = exchange.getRequest();
        String ipaddiress = ServerHttpRequestUtil.getIpAddress(serverHttpRequest);
        List<String> hmd = strToList((String) redisUtils.get(SysDisableIpSigEnum.XIAOYU_HMD.getCode()));
        if (hmd.contains(ipaddiress)){
            log.info("该IP在黑名单中不可放行");
            exchange.getResponse().setStatusCode(HttpStatus.NO_CONTENT);
            return exchange.getResponse().setComplete();
        }
        List<String> dljk = strToList((String) redisUtils.get(SysDisableIpSigEnum.XIAOYU_DLJK.getCode()));
        URI uri = serverHttpRequest.getURI();
        String url = uri.getPath();
        if (dljk.contains(url)){
            log.info("请求的是登录接口直接放行");
            return chain.filter(exchange);
        }
        HttpHeaders httpHeaders = serverHttpRequest.getHeaders();
        // 判断是否有系统颁发的登录token如果没有不能放行
        String token = httpHeaders.getFirst(SysConstantsEnum.LOGIN_TOKEN.getValue());
        if (StringUtils.isBlank(token)){
            // 请求头中没有token不能放行
            log.info("请求头中没有token不能放行");
            exchange.getResponse().setStatusCode(HttpStatus.NO_CONTENT);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    /**
     * json字符串转集合
     */
    private List<String> strToList(String data){
        List<String> list = new ArrayList<>();
        if (StringUtils.isEmpty(data)){
            return list;
        }
        return list = JSONObject.parseArray(data,String.class);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
