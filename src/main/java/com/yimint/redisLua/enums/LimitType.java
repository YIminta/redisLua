package com.yimint.redisLua.enums;

/**
 * @author yimint
 * @description  限流类型
 * @date 2023-03-07
 */
public enum LimitType {

    /**
     * 自定义key
     */
    CUSTOMER,

    /**
     * 请求者IP
     */
    IP;
}