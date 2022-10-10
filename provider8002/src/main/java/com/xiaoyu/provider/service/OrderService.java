package com.xiaoyu.provider.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.provider.entity.Order;

/**
 * WJY
 */
public interface OrderService {

    /**
     * 创建订单数据
     * @param order
     */
    CommonResult create(Order order);
}
