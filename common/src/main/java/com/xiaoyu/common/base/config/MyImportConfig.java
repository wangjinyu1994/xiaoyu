package com.xiaoyu.common.base.config;

import com.xiaoyu.common.base.util.ApplicationContextUtil;
import com.xiaoyu.common.base.util.RedisUtils;
import org.springframework.context.annotation.Import;

/**
 * WJY
 */
@Import(value = {RedisConfig.class, RedisUtils.class, ApplicationContextUtil.class})
public class MyImportConfig {
}
