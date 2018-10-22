package com.dongecs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dongecs
 * @create 2018-10-21 20:56
 * @desc
 **/
@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("test")
    public String test(){
        return this.testService.remoteService();
    }


}
