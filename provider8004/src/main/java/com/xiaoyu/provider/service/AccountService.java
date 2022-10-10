package com.xiaoyu.provider.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * WJY
 */
public interface AccountService {

    /**
     * 扣减账户余额
     *
     * @param userId 用户id
     * @param money  金额
     */
    int decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);

}
