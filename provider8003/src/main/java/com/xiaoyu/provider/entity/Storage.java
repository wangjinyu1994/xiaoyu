package com.xiaoyu.provider.entity;

import lombok.Data;

/**
 * WJY
 */
@Data
public class Storage {

    private Long id;
    private Long productId;
    private Integer total;
    private Integer used;
    private Integer residue;

}
