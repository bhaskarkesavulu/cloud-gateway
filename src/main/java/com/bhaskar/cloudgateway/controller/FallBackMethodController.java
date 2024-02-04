package com.bhaskar.cloudgateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @RequestMapping(value = "/userServiceFallBack")
    public String userServiceFallBackMethod(){

        return "User Service is taking more time : might be down"+" Please try again later!";
    }

    @RequestMapping(value = "/departmentServiceFallBack")
    public String departmentServiceFallBackMethod(){

        return "Department Service is taking more time : might be down"+" Please try again later!";
    }
}
