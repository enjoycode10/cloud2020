package com.okgo.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @auther Shawn
 * @create 2020-02-20 18:22
 *
 * 本次案例服务降级处理是在客户端80实现完成,与服务端8001没有关系
 * 只需要为Feign客户端定义的接口添加一个服务降级处理的实现类即可实现解耦
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService
{
    @Override
    public String paymentInfo_OK(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
