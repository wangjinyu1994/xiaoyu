package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtryjsxxb;
import com.xiaoyu.provider.user.req.SelectUserRoleByUserIdReq;
import com.xiaoyu.provider.user.resp.SelectUserRoleByUserIdResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XtryjsxxbMapperEx {

    int insertXtryjsxxb(@Param("data") Xtryjsxxb record);


    List<SelectUserRoleByUserIdResp> selectUserRoleByUserId(@Param("data")SelectUserRoleByUserIdReq req);

    Xtryjsxxb selectXtryjsxxbByUserIdAndJsId(@Param("userId")Long userId, @Param("roleId")Long roleId);
}