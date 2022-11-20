package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtryxxb;
import com.xiaoyu.provider.user.resp.SysUserByIdResp;
import org.apache.ibatis.annotations.Param;

public interface XtryxxbMapperEx {

    int insertXtryxxb(@Param("data") Xtryxxb record);

    /**
     * 根据人员主键查询人员信息请求接口
     */
    SysUserByIdResp selectSysUserById(@Param("data") Long userId);

    /**
     * 根据账号和人员类型查找用户
     */
    Xtryxxb selectSysUserByLoginName(@Param("loginName")String loginName, @Param("userType")String userType);
}