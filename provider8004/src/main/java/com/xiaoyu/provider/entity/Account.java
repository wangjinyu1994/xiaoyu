package com.xiaoyu.provider.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * WJY
 */
@Data
public class Account {

    private Long id;
    private Long userId;
    private BigDecimal total;
    private BigDecimal used;
    private BigDecimal residue;

}
