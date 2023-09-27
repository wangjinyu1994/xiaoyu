package com.xiaoyu.provider.order.service.impl;

import com.alibaba.nacos.common.utils.CollectionUtils;
import com.xiaoyu.common.base.req.LoginUserInfo;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.common.base.util.HttpServletRequestUtil;
import com.xiaoyu.provider.order.dao.XttgxmfjxxbMapper;
import com.xiaoyu.provider.order.dao.XttgxmxxbMapper;
import com.xiaoyu.provider.order.dao.ex.XttgxmfjxxbMapperEx;
import com.xiaoyu.provider.order.dao.ex.XttgxmxxbMapperEx;
import com.xiaoyu.provider.order.entity.Xttgxmfjxxb;
import com.xiaoyu.provider.order.entity.Xttgxmxxb;
import com.xiaoyu.provider.order.req.*;
import com.xiaoyu.provider.order.resp.*;
import com.xiaoyu.provider.order.service.ProjectService;
import com.xiaoyu.provider.order.util.ReqParamToEntityUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Objects;

/**
 * WJY
 */
@Service
@Slf4j
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private XttgxmxxbMapper xttgxmxxbMapper;
    @Autowired
    private XttgxmxxbMapperEx xttgxmxxbMapperEx;
    @Autowired
    private XttgxmfjxxbMapper xttgxmfjxxbMapper;
    @Autowired
    private XttgxmfjxxbMapperEx xttgxmfjxxbMapperEx;

    @Override
    public TableResult<SelectProjectTableResp> selectProjectTable(SelectProjectTableReq req) {
        List<SelectProjectTableResp> rows = xttgxmxxbMapperEx.selectProjectTable(req);
        Integer total = xttgxmxxbMapperEx.countSelectProjectTable(req);
        return TableResult.success(rows,total);
    }

    @Override
    public CommonResult<List<SelectAllProjectResp>> selectAllProject(SelectAllProjectReq req) {
        List<SelectAllProjectResp> list = xttgxmxxbMapperEx.selectAllProject(req);
        return CommonResult.success(list);
    }

    @Override
    public CommonResult<SelectProjectByIdResp> selectProjectById(SelectProjectByIdReq req) {
        SelectProjectByIdResp resp = xttgxmxxbMapperEx.selectProjectById(req);
        if (Objects.nonNull(resp)){
            resp.setBody(xttgxmfjxxbMapperEx.selectXttgxmfjxxbByXmzj(resp.getZj()));
        }
        return CommonResult.success(resp);
    }

    @Override
    public CommonResult<AddProjectInfoResp> addProjectInfo(AddProjectInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xttgxmxxb xttgxmxxb = ReqParamToEntityUtils.addProjectInfo(req,loginUserInfo.getUserId());
        xttgxmxxbMapperEx.insertXttgxmxxb(xttgxmxxb);
        if (CollectionUtils.isNotEmpty(req.getBody())){
            List<Xttgxmfjxxb> xttgxmfjxxbs = ReqParamToEntityUtils.addProjectEnclosure(req.getBody(),xttgxmxxb.getZj(),loginUserInfo.getUserId());
            xttgxmfjxxbMapperEx.insertXttgxmfjxxbBath(xttgxmfjxxbs);
        }
        return CommonResult.success();
    }

    @Override
    public CommonResult<UpdateProjectInfoResp> updateProjectInfo(UpdateProjectInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xttgxmxxb xttgxmxxb = ReqParamToEntityUtils.updateProjectInfo(req,loginUserInfo.getUserId());
        xttgxmxxbMapper.updateByPrimaryKeySelective(xttgxmxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<DeleteProjectInfoResp> deleteProjectInfo(DeleteProjectInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xttgxmxxb xttgxmxxb = ReqParamToEntityUtils.deleteProjectInfo(req,loginUserInfo.getUserId());
        xttgxmxxbMapper.updateByPrimaryKeySelective(xttgxmxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<AddProjectEnclosureInfoResp> addProjectEnclosureInfo(AddProjectEnclosureInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xttgxmfjxxb xttgxmfjxxb = ReqParamToEntityUtils.addProjectEnclosureInfo(req,loginUserInfo.getUserId());
        xttgxmfjxxbMapperEx.insertXttgxmfjxxb(xttgxmfjxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<AddProjectEnclosureListInfoResp> addProjectEnclosureListInfo(AddProjectEnclosureListInfo req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        List<Xttgxmfjxxb> xtxxtzfjxxbs = ReqParamToEntityUtils.addProjectEnclosureListInfo(req,loginUserInfo.getUserId());
        xttgxmfjxxbMapperEx.insertXttgxmfjxxbBath(xtxxtzfjxxbs);
        return CommonResult.success();
    }

    @Override
    public CommonResult<UpdateProjectEnclosureInfoResp> updateProjectEnclosureInfo(UpdateProjectEnclosureInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xttgxmfjxxb xttgxmfjxxb = ReqParamToEntityUtils.updateProjectEnclosureInfo(req,loginUserInfo.getUserId());
        xttgxmfjxxbMapper.updateByPrimaryKeySelective(xttgxmfjxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<DeleteProjectEnclosureInfoResp> deleteProjectEnclosureInfo(DeleteProjectEnclosureInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xttgxmfjxxb xttgxmfjxxb = ReqParamToEntityUtils.deleteProjectEnclosureInfo(req,loginUserInfo.getUserId());
        xttgxmfjxxbMapper.updateByPrimaryKeySelective(xttgxmfjxxb);
        return CommonResult.success();
    }
}
