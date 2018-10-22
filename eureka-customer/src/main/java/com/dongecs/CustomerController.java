package com.dongecs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dongecs
 * @create 2018-10-19 0:10
 * @desc
 **/
@RestController
public class CustomerController {

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("customer")
    public String customer(){
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("eureka-client");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/test";
        System.out.println(url);
        return this.restTemplate.getForObject(url, String.class);
    }
}
