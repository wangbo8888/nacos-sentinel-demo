package com.wang.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @Author: Mr.wang
 * @Email: mip6282@dingtalk.com
 * @Date: 2019/11/27
 */
@RestController
public class HelloController {

    @GetMapping("/say")
    public String say() {
        return "hello Mr.wang !";
    }
}
