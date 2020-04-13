package com.primten.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class lxcontroller {
    @RequestMapping("/hello")
public  String  lx(){
    return "hello wored";
}
}
