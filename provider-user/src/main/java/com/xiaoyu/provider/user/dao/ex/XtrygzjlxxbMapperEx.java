package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtrygzjlxxb;
import com.xiaoyu.provider.user.resp.SelectSysUserWorkExperienceResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XtrygzjlxxbMapperEx {

    int insertXtrygzjlxxb(@Param("data") Xtrygzjlxxb record);

    /**
     * 获取人员工作经历请求接口
     */
    List<SelectSysUserWorkExperienceResp> selectSysUserWorkExperience(Long userId);
}