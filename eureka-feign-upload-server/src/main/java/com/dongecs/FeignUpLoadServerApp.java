package com.dongecs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author dongecs
 * @create 2018-10-21 15:02
 * @desc
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class FeignUpLoadServerApp {

    public static void main(String[] args) {
        SpringApplication.run(FeignUpLoadServerApp.class, args);
    }

    @RestController
    class UploadServer{

        @PostMapping(value = "upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
        public String upload(@RequestPart(name = "file") MultipartFile file){
            System.out.println(file.getName());
            return file.getName();
        }

    }
}
