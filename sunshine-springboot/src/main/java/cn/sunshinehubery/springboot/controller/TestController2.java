package cn.sunshinehubery.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2019/8/19 22:57
 * @Version: 1.0
 **/
@RestController //相当于Controller + ResponseBody
@RequestMapping("/hello2")
public class TestController2 {
    @RequestMapping("/test")
    public String test(){
        return "Hello Spring Boot2";
    }
}
