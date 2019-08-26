package cn.sunshinehubery.service.controller;

import cn.sunshinehubery.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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
    @Autowired
    private DiscoveryClient discoveryClient;
    @GetMapping
    @ResponseBody
    public User queryById(@RequestParam("id")Long id){
        List<ServiceInstance> instances = discoveryClient.getInstances("service-provider");
        ServiceInstance serviceInstance = instances.get(0);
        User user = restTemplate.getForObject("http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/user/" + id, User.class);
        return user;
    }
}
