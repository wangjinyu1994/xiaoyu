package com.xiaoyu.gateway.filter;

import com.xiaoyu.common.base.constants.SysConstantsEnum;
import com.xiaoyu.common.base.util.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * WJY
 */
@Component
@Slf4j
public class MyGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest serverHttpRequest = exchange.getRequest();
        HttpHeaders httpHeaders = serverHttpRequest.getHeaders();
        String token = httpHeaders.getFirst(SysConstantsEnum.LOGIN_TOKEN.getValue());
        if (StringUtils.isBlank(token)){
            // 请求头中没有token不能放行
            return exchange.getResponse().setComplete();
        }
        // 对token进行解码如果解码失败不能放行
        try {
            JwtUtil.parseToken(token);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 请求头中有token 校验token是否可以被jwt
        log.info("进入自定义的全局过滤器 MyGlobalFilter" + new Date());
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        if (uname == null) {
            log.info("参数 uname 不能为 null！");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
           // return exchange.getResponse().setComplete();
          //  return chain.filter(exchange);
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
