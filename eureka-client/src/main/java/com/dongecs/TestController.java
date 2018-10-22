package com.dongecs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dongecs
 * @create 2018-10-18 0:54
 * @desc
 **/
@RestController
public class TestController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/test")
    public String dc() throws InterruptedException {
//        Thread.sleep(5000L);
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
