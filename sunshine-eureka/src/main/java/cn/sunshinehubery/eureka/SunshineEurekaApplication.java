package cn.sunshinehubery.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer   //声明是一个eureka服务中心
public class SunshineEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SunshineEurekaApplication.class, args);
    }

}
