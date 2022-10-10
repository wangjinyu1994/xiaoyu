package com.xiaoyu.provider.mapper;

import com.xiaoyu.provider.entity.Storage;
import org.apache.ibatis.annotations.Mapper;

/**
 * WJY
 */
@Mapper
public interface StorageMapper {

    Storage selectByProductId(Long productId);
    int decrease(Storage record);

}
