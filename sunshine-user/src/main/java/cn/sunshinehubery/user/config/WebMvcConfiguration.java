package cn.sunshinehubery.user.config;

import cn.sunshinehubery.user.interceptors.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2019/8/23 15:49
 * @Version: 1.0
 **/
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
    @Autowired
    private MyInterceptor myInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor);
    }
}
