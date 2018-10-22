package com.dongecs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author dongecs
 * @create 2018-10-21 15:17
 * @desc
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignUploadClientApp {

    public static void main(String[] args) {
        SpringApplication.run(FeignUploadClientApp.class, args);
    }

}
