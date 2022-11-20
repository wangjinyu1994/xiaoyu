package com.xiaoyu.provider.system.dao.ex;

import com.xiaoyu.provider.system.entity.Xtdljkxxb;
import com.xiaoyu.provider.system.req.SelectLoginInterListReq;
import com.xiaoyu.provider.system.req.SelectLoginInterTableReq;
import com.xiaoyu.provider.system.resp.SelectLoginInterTableResp;
import com.xiaoyu.provider.system.resp.SelectLoginInterlistListResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * WJY
 */
public interface XtdljkxxbMapperEx {
    List<String> getXtdljkxxbInfo();

    /**
     * 获取所有登录放行请求接口
     */
    List<SelectLoginInterlistListResp> selectLoginInterfaceList(@Param("data") SelectLoginInterListReq req);

    /**
     * 获取所有登录放行请求接口分页
     */
    List<SelectLoginInterTableResp> selectLoginInterfacelistTable(@Param("data")SelectLoginInterTableReq req);

    /**
     * 获取所有登录放行请求接口分页 总数
     */
    Integer countSelectLoginInterfacelistTable(@Param("data")SelectLoginInterTableReq req);

    /**
     * 批量添加系统登录接口信息表
     */
    int insertXtdljkxxbBath(@Param("data")List<Xtdljkxxb> list);
}
