package cn.sunshinehubery.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cn.sunshinehubery.service.mapper")
public class SunshineServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SunshineServiceProviderApplication.class, args);
    }

}
