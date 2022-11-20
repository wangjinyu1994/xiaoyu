package com.xiaoyu.provider.system.dao.ex;

import com.xiaoyu.provider.system.entity.Xthbmdxxb;
import com.xiaoyu.provider.system.req.SelectBlacklistListReq;
import com.xiaoyu.provider.system.req.SelectBlacklistTableReq;
import com.xiaoyu.provider.system.resp.SelectBlacklistListResp;
import com.xiaoyu.provider.system.resp.SelectBlacklistTableResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * WJY
 */
public interface XthbmdxxbMapperEx {

    /**
     * 获取所有黑名单请求接口
     */
    List<SelectBlacklistListResp> selectDictionaryType(@Param("data") SelectBlacklistListReq req);

    /**
     * 获取所有黑名单请求接口分页
     */
    List<SelectBlacklistTableResp> selectBlacklistTable(@Param("data")SelectBlacklistTableReq req);

    /**
     * 获取所有黑名单请求接口分页总数
     */
    Integer countSelectBlacklistTable(@Param("data")SelectBlacklistTableReq req);

    List<String> getXthbmdxxbInfo();

    /**
     * 批量添加黑白名单信息
     */
    int insertXthbmdxxbBath(@Param("data")List<Xthbmdxxb> list);
}
