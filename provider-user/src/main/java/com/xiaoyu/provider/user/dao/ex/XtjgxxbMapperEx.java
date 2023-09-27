package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtjgxxb;
import com.xiaoyu.provider.user.req.SelectAllOrgReq;
import com.xiaoyu.provider.user.req.SelectOrgByIdReq;
import com.xiaoyu.provider.user.req.SelectOrgTableReq;
import com.xiaoyu.provider.user.resp.SelectAllOrgResp;
import com.xiaoyu.provider.user.resp.SelectOrgByIdResp;
import com.xiaoyu.provider.user.resp.SelectOrgTableResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XtjgxxbMapperEx {

    int insertXtjgxxb(@Param("data") Xtjgxxb xtjgxxb);

    List<SelectOrgTableResp> selectOrgTable(@Param("data")SelectOrgTableReq req);

    Integer countSelectOrgTable(@Param("data")SelectOrgTableReq req);

    List<SelectAllOrgResp> selectAllOrgList(@Param("data")SelectAllOrgReq req);

    SelectOrgByIdResp selectOrgById(@Param("data")SelectOrgByIdReq req);
}