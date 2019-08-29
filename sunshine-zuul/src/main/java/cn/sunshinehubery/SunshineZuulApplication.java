package cn.sunshinehubery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy    //开启zuul组件
@EnableDiscoveryClient    //开启eureka
public class SunshineZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SunshineZuulApplication.class, args);
    }

}
