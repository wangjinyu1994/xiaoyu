package com.xiaoyu.provider.mapper;

import com.xiaoyu.provider.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * WJY
 */
@Mapper
public interface AccountMapper {

    Account selectByUserId(Long userId);
    int decrease(@Param("userId") Long userId, @Param("money")BigDecimal money);

}
