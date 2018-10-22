package com.dongecs;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author dongecs
 * @create 2018-10-21 20:59
 * @desc
 **/

@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String remoteService(){
        return restTemplate.getForObject("http://eureka-client/test", String.class);
    }

    public String fallback() {
        return "fallback";
    }
}
