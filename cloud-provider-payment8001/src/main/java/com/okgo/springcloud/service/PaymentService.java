package com.okgo.springcloud.service;

import com.okgo.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Shawn
 * @date 2020/3/25 0:35
 * @title Function
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
