package com.dongecs;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author dongecs
 * @create 2018-10-28 22:18
 * @desc
 **/
@SpringCloudApplication
@EnableZuulProxy
public class ApiGateWayApp {

    public static void main(String[] args) {
        SpringApplication.run(ApiGateWayApp.class, args);
    }

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
