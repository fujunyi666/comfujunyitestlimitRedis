package com.funjunyi.test.limitRedis;

public enum LimitType {
    /**
     * 默认策略
     */
    DEFAULT,
    /**
     * 根据IP进行限流
     */
    IP
}