package com.xiaoyu.provider.service.impl;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.provider.entity.Order;
import com.xiaoyu.provider.mapper.OrderMapper;
import com.xiaoyu.provider.service.AccountService;
import com.xiaoyu.provider.service.OrderService;
import com.xiaoyu.provider.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * WJY
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;
    /**
     * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     * 简单说：下订单->扣库存->减余额->改订单状态
     */
    @Override
    @GlobalTransactional(rollbackFor = Exception.class)
    public CommonResult create(Order order) {
        log.info("----->开始新建订单");
        //1 新建订单
        order.setUserId(new Long(1));
        order.setStatus(0);
        orderMapper.create(order);
        //2 扣减库存
        log.info("----->订单服务开始调用库存服务，开始扣减库存");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("----->订单微服务开始调用库存，扣减库存结束");
        //3 扣减账户
        log.info("----->订单服务开始调用账户服务，开始从账户扣减商品金额");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("----->订单微服务开始调用账户，账户扣减商品金额结束");
        //4 修改订单状态，从零到1,1代表已经完成
        log.info("----->修改订单状态开始");
        orderMapper.update(order.getUserId(), 0);
        log.info("----->修改订单状态结束");
        log.info("----->下订单结束了------->");
        return new CommonResult(200 + "", "订单创建成功");
    }
}
