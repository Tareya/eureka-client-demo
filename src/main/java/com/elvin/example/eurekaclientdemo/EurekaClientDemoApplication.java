package com.elvin.example.eurekaclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientDemoApplication.class, args);
    }
    @RequestMapping("test1")
    public String helloDemoEurekaClientApi1(){
        return "hello Demo Eureka Client test1";
    }
    @RequestMapping("test2")
    public String helloDemoEurekaClientApi2(){
        return "hello Demo Eureka Client test2";
    }

    @RequestMapping("oom")
    public String helloDemoEurekaClientOOM(){
        List<Object> demoList = new ArrayList<Object>();
        while(true) {
            demoList.add(new Object());
        }
    }

}
