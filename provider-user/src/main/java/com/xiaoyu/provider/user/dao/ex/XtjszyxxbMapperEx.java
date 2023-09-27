package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtjszyxxb;
import com.xiaoyu.provider.user.req.SelectRoleResourceByIdReq;
import com.xiaoyu.provider.user.req.SelectRoleResourceReq;
import com.xiaoyu.provider.user.req.SelectRoleResourceTableReq;
import com.xiaoyu.provider.user.resp.SelectRoleResourceByIdResp;
import com.xiaoyu.provider.user.resp.SelectRoleResourceResp;
import com.xiaoyu.provider.user.resp.SelectRoleResourceTableResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XtjszyxxbMapperEx {

    int insertXtjszyxxb(@Param("data") Xtjszyxxb record);

    List<SelectRoleResourceResp> selectRoleResourceList(@Param("data")SelectRoleResourceReq req);

    List<SelectRoleResourceTableResp> selectRoleResourceTable(@Param("data")SelectRoleResourceTableReq req);

    Integer countSelectRoleResourceTable(@Param("data")SelectRoleResourceTableReq req);

    SelectRoleResourceByIdResp selectRoleResourceById(@Param("data")SelectRoleResourceByIdReq req);

    Xtjszyxxb selectXtjszyxxbByRoleIdAndResourceId(@Param("roleId")Long roleId, @Param("resourceId")Long resourceId);
}