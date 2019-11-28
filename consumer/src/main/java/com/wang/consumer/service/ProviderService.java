package com.wang.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @Author: Mr.wang
 * @Email: mip6282@dingtalk.com
 * @Date: 2019/11/27
 */
@FeignClient(value = "provider")
public interface ProviderService {

    @GetMapping("/say")
     String say();

}
