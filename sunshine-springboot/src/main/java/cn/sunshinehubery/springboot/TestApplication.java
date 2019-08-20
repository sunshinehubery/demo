package cn.sunshinehubery.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2019/8/19 23:15
 * @Version: 1.0
 **/
@EnableAutoConfiguration  //自动扫描配置文件
@ComponentScan  //扫描注解相当于<context:component-scan base-package = "" />,这里表示扫描该类以及该类下的包以及同一级别下所有包以及子包下的资源
@SpringBootApplication  //相当于@EnableAutoConfiguration @ComponentScan @SpringBootConfiguration（配置信息）
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(TestApplication.class);
        //表示关闭启动打印在控制台的图案
        //app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
