package com.wang.consumer.utils;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @description:
 * @Author: Mr.wang
 * @Email: mip6282@dingtalk.com
 * @Date: 2019/11/28
 */
public final class SentinelExceptionUtil {

    public static String handleException(BlockException ex) {
        System.out.println("block=============================");
        System.err.println("错误发生: " + ex.getClass().getCanonicalName());
        return "error";
    }

}
