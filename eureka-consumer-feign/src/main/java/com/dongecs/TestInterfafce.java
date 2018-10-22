package com.dongecs;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author dongecs
 * @create 2018-10-20 18:32
 * @desc
 **/
@FeignClient("eureka-client")
public interface TestInterfafce {

    @GetMapping("/test")
    public String dc();
}
