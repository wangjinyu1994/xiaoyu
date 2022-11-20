package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtryjyqkxxb;
import com.xiaoyu.provider.user.resp.SysUserEducationResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XtryjyqkxxbMapperEx {

    int insertXtryjyqkxxb(@Param("data") Xtryjyqkxxb record);

    /**
     * 获取人员教育情况请求接口
     */
    List<SysUserEducationResp> selectSysUserEducation(@Param("data")Long userId);
}