package com.dongecs;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author dongecs
 * @create 2018-10-21 20:54
 * @desc
 **/
@SpringCloudApplication
public class RibbonHystrixApp {

    public static void main(String[] args) {
        SpringApplication.run(RibbonHystrixApp.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
