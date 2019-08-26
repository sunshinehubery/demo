package cn.sunshinehubery.service.controller;

import cn.sunshinehubery.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2019/8/26 12:21
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/consumer/user")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping
    @ResponseBody
    public User queryById(@RequestParam("id")Long id){
        User user = restTemplate.getForObject("http://localhost:8088/user/" + id, User.class);
        return user;
    }
}
