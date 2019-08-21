package cn.sunshinehubery.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @description: springBoot四种属性的注入（@Autowired，构造方法，方法内形参，方法使用@ConfigurationProperties("jdbc")）
 * @author: sunshinehubery
 * @date: 2019/8/20 23:01
 * @Version: 1.0
 **/
//首先是配置信息,添加注解表明该类是配置类
@Configuration
//读取jdbc.properties文件
//@PropertySource("classpath:jdbc.properties")  //使用Spring注解用法
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfigration {
    /*//获取文件中的数据
    @Value("${jdbc.driverClassName}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;*/
    //@Autowired
   /* private JdbcProperties jdbcProperties;
    public JdbcConfigration(JdbcProperties jdbcProperties){
        this.jdbcProperties = jdbcProperties;
    }*/
    //创建一个DataSource
    /*@Bean   //方法形参
    public DataSource dataSource(JdbcProperties jdbcProperties){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        druidDataSource.setUrl(jdbcProperties.getUrl());
        druidDataSource.setUsername(jdbcProperties.getUsername());
        druidDataSource.setPassword(jdbcProperties.getPassword());
        return druidDataSource;
    }*/
    @Bean
    @ConfigurationProperties("jdbc")
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }

}
