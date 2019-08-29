package cn.sunshinehubery.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
//@EnableDiscoveryClient
//@EnableCircuitBreaker    //开启熔断
@SpringCloudApplication  //组合注解
@EnableFeignClients  //开启feign客户端
public class SunshineServiceConsumerApplication {
    //feign自动集成了Ribbon负载均衡中的RestTemplate，所以不需要注册RestTemplate
    /*@Bean
    @LoadBalanced   //开启负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(SunshineServiceConsumerApplication.class, args);
    }

}
