package com.xiaoyu.provider.user.dao.ex;

import com.xiaoyu.provider.user.entity.Xtryjgxxb;
import com.xiaoyu.provider.user.req.SelectUserByOrgIdReq;
import com.xiaoyu.provider.user.resp.SelectUserByOrgIdResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XtryjgxxbMapperEx {


    int insertXtryjgxxb(@Param("data") Xtryjgxxb record);

    List<SelectUserByOrgIdResp> selectUserByOrgIdResp(@Param("data")SelectUserByOrgIdReq req);

    Integer countSelectUserByOrgIdResp(@Param("data")SelectUserByOrgIdReq req);
}