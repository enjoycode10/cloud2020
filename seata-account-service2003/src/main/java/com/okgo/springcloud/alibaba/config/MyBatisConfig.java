package com.okgo.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther Shawn
 * @create 2019-12-11 16:57
 */
@Configuration
@MapperScan({"com.okgo.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
