package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtryjtcyxxb;
import com.xiaoyu.provider.user.resp.SysUserMemberOfFamilyResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XtryjtcyxxbMapperEx {

    int insertXtryjtcyxxb(@Param("data") Xtryjtcyxxb record);

    /**
     * 获取家庭成员信息请求接口
     */
    List<SysUserMemberOfFamilyResp> selectSysUserMemberOfFamilyById(@Param("data")Long userId);
}