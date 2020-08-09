package com.okgo.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author Shawn
 * @date 2020/3/27 14:43
 * @title Function
 */
public interface LoadBalancer {
    ServiceInstance getInstance(List<ServiceInstance> serviceInstances);
}
