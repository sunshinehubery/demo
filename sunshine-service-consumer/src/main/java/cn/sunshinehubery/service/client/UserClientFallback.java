package cn.sunshinehubery.service.client;

import cn.sunshinehubery.service.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2019/8/29 12:31
 * @Version: 1.0
 **/
@Component   //注入到spring
public class UserClientFallback implements UserClient {
    @Override
    public User queryById(Long id) {
        User user = new User();
        user.setUsername("服务器繁忙，请稍候重试！");
        return user;
    }
}
