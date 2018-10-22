package com.dongecs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author dongecs
 * @create 2018-10-21 19:07
 * @desc https://github.com/dongecs/config-repo-demo.git
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServerApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApp.class, args);
    }
}
