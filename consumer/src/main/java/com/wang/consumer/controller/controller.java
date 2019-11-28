package com.wang.consumer.controller;

import com.wang.consumer.service.ProviderService;
import com.wang.consumer.service.SentinelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @Author: Mr.wang
 * @Email: mip6282@dingtalk.com
 * @Date: 2019/11/27
 */
@RestController
public class controller {
    @Resource
    private ProviderService providerService;
    @Resource
    private SentinelService sentinelService;

    @RequestMapping("/consumerSay")
    public String say() {
        return providerService.say();
    }

    @RequestMapping("/say")
    public String sentinelSay() {
        return sentinelService.sentinelSay();
    }
}
