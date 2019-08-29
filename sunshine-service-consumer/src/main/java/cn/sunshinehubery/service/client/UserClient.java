package cn.sunshinehubery.service.client;

import cn.sunshinehubery.service.configuration.FeignLogConfiguration;
import cn.sunshinehubery.service.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2019/8/29 12:25
 * @Version: 1.0
 **/
@FeignClient(value = "service-provider",fallback = UserClientFallback.class,configuration = FeignLogConfiguration.class)  //表示申明的是一个feign接口
public interface UserClient {
    @GetMapping("user/{id}")
    User queryById(@PathVariable("id")Long id);
}
