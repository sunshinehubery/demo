package cn.sunshinehubery.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2019/8/19 22:57
 * @Version: 1.0
 **/
@RestController //相当于Controller + ResponseBody
@RequestMapping("/hello")
public class TestController {
    //注入DataSource,查看是否又没将数据携带
    @Autowired
    private DataSource dataSource;

    @RequestMapping("/test")
    public String test(){
        return "Hello Spring Boot";
    }
}
