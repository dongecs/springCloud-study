package com.dongecs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dongecs
 * @create 2018-10-20 18:31
 * @desc
 **/
@RestController
public class CustomerController {

    @Autowired
    TestInterfafce testInterfafce;

    @GetMapping("feignCustomer")
    public String feignCustomer(){
        return this.testInterfafce.dc();
    }
}
