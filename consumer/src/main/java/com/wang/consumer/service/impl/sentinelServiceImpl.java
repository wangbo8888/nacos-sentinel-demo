package com.wang.consumer.service.impl;

import com.wang.consumer.service.SentinelService;
import com.wang.consumer.utils.SentinelExceptionUtil;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @Author: Mr.wang
 * @Email: mip6282@dingtalk.com
 * @Date: 2019/11/28
 */
@Service
public class sentinelServiceImpl implements SentinelService {

    @SentinelResource(value = "sentinelSay", blockHandler = "handleException", blockHandlerClass = SentinelExceptionUtil.class)
    @Override
    public String sentinelSay() {
        return "sentinel:hello Mr.wang!";
    }
}
