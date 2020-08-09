package com.okgo.rules;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Shawn
 * @date 2020/3/27 13:29
 * @title Function
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule getRule(){
        return new RandomRule();
    }
}
