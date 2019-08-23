package cn.sunshinehubery.user.service;

import cn.sunshinehubery.user.pojo.User;

import java.util.List;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2019/8/23 21:53
 * @Version: 1.0
 **/

public interface UserService {
    public User findById(Long id)throws Exception;

    public List<User> list()throws Exception;
}
