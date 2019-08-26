package cn.sunshinehubery.service.service;

import cn.sunshinehubery.service.pojo.User;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2019/8/26 12:03
 * @Version: 1.0
 **/
public interface UserService {
    User queryById(Long id)throws Exception;
}
