package cn.sunshinehubery.user.controller;

import cn.sunshinehubery.user.pojo.User;
import cn.sunshinehubery.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2019/8/23 15:36
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/all")
    public String list(Model model) throws Exception {
        List<User> users = userService.list();
        model.addAttribute("users",users);
        return "users";
    }

    @RequestMapping("/{id}")
    @ResponseBody
    public User findById(@PathVariable("id")Long id) throws Exception {
        return userService.findById(id);
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "user test";
    }
}
