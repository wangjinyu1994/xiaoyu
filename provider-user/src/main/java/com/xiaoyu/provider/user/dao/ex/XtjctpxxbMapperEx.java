package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtjctpxxb;
import com.xiaoyu.provider.user.req.SelectPicturesByIdReq;
import com.xiaoyu.provider.user.req.SelectPicturesReq;
import com.xiaoyu.provider.user.req.SelectPicturesTableReq;
import com.xiaoyu.provider.user.resp.SelectPicturesByIdResp;
import com.xiaoyu.provider.user.resp.SelectPicturesResp;
import com.xiaoyu.provider.user.resp.SelectPicturesTableResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XtjctpxxbMapperEx {

    int insertXtjctpxxb(@Param("data") Xtjctpxxb xtjctpxxb);

    List<SelectPicturesTableResp> selectPicturesTable(@Param("data")SelectPicturesTableReq req);

    Integer countSelectPicturesTable(@Param("data")SelectPicturesTableReq req);

    List<SelectPicturesResp> selectAllPicturesList(@Param("data")SelectPicturesReq req);

    SelectPicturesByIdResp selectPicturesById(@Param("data")SelectPicturesByIdReq req);
}