package com.xiaoyu.provider.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * WJY
 */
@Data
public class Order {

    private Long id;
    private Long userId;
    private Long productId;
    private Integer count;
    private BigDecimal money;
    private Integer status;
}
