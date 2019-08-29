package cn.sunshinehubery.service.controller;

import cn.sunshinehubery.service.client.UserClient;
import cn.sunshinehubery.service.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @description: feign集成了Hystrix,都在申明的接口完成
 * @author: sunshinehubery
 * @date: 2019/8/26 12:21
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/consumer/user")
//@DefaultProperties(defaultFallback = "fallBack")
public class UserController {
    @Autowired
    private UserClient userClient;
    /*@Autowired
    private RestTemplate restTemplate;*/
    /*@Autowired
    private DiscoveryClient discoveryClient;*/
    @GetMapping("/{id}")
    @ResponseBody
    //@HystrixCommand
    public String queryById(@PathVariable("id")Long id){
       /* List<ServiceInstance> instances = discoveryClient.getInstances("service-provider");
        ServiceInstance serviceInstance = instances.get(0);*/
       /* String baseUrl = "http://service-provider/user/"+ id;
        return restTemplate.getForObject(baseUrl, String.class);*/
       return userClient.queryById(id).toString();
    }

    //局部熔断请求，熔断的方法的返回值与设置该熔断方法的返回值一致
    //参数也需要一致
   /* public String queryByIdFallBack(Long id){
        return "请求繁忙，请稍后尝试！";
    }

    //作用于全局熔断方法，熔断的方法的返回值与设置该熔断方法的返回值一致，但参数值熔断方法为空
    public String fallBack(){
        return "请求繁忙中，请稍后尝试！";
    }*/
}
