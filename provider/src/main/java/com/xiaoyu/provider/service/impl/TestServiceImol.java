package com.xiaoyu.provider.service.impl;

import com.xiaoyu.common.base.constants.DeleteFlagEnum;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.provider.base.entity.Xtzyxxb;
import com.xiaoyu.provider.dao.ex.XtzyxxbMapperEx;
import com.xiaoyu.provider.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * WJY
 */
@Service
public class TestServiceImol implements TestService {

    @Autowired
    private XtzyxxbMapperEx xtzyxxbMapperEx;

    @Override
    public CommonResult testInsert() {
        Xtzyxxb xtzyxxb = new Xtzyxxb();
        xtzyxxb.setBz("aa");
        xtzyxxb.setCjsj(new Date());
        xtzyxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        int aa = xtzyxxbMapperEx.insertXtzyxxb(xtzyxxb);
        return CommonResult.success(xtzyxxb.getZj());
    }
}
