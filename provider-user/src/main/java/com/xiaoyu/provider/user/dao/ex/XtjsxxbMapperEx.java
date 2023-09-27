package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtjsxxb;
import com.xiaoyu.provider.user.req.SelectAllRoleReq;
import com.xiaoyu.provider.user.req.SelectAllRoleResp;
import com.xiaoyu.provider.user.req.SelectRoleByIdReq;
import com.xiaoyu.provider.user.req.SelectRoleTableReq;
import com.xiaoyu.provider.user.resp.SelectRoleByIdResp;
import com.xiaoyu.provider.user.resp.SelectRoleTableResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XtjsxxbMapperEx {


    int insertXtjsxxb(@Param("data") Xtjsxxb xtjsxxb);

    List<SelectRoleTableResp> selectRoleTable(@Param("data")SelectRoleTableReq req);

    Integer countSelectRoleTable(@Param("data")SelectRoleTableReq req);

    List<SelectAllRoleResp> selectAllRoleList(@Param("data")SelectAllRoleReq req);

    SelectRoleByIdResp selectRoleById(@Param("data")SelectRoleByIdReq req);
}