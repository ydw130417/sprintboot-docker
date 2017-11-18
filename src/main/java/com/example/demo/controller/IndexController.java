package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HYL
 * @create 2017-11-18 下午10:04
 **/
@RestController
public class IndexController {
    @RequestMapping("/")
    public String hello(){
        return "hello word";
    }
}
