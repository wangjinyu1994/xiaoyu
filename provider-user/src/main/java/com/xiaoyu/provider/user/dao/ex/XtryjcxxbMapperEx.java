package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtryjcxxb;
import com.xiaoyu.provider.user.resp.SysUserBaseByIdResp;
import org.apache.ibatis.annotations.Param;

public interface XtryjcxxbMapperEx {
    int insertXtryjcxxb(@Param("data") Xtryjcxxb xtryjcxxb);

    /**
     * 根据人员主键查询人员基础信息请求接口
     */
    SysUserBaseByIdResp selectSysUserBaseById(@Param("data") Long userId);
}