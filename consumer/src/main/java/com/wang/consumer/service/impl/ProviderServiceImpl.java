package com.wang.consumer.service.impl;

import com.wang.consumer.service.ProviderService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @Author: Mr.wang
 * @Email: mip6282@dingtalk.com
 * @Date: 2019/11/27
 */
@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String say() {
        return "consumerSay!";
    }
}
