package cn.sunshinehubery.service.controller;

import cn.sunshinehubery.service.pojo.User;
import cn.sunshinehubery.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2019/8/26 12:06
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/{id}")
    @ResponseBody
    public User queryById(@PathVariable("id")Long id) throws Exception {
        return userService.queryById(id);
    }
}
