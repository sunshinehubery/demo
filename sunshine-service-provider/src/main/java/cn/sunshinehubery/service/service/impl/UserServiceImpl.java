package cn.sunshinehubery.service.service.impl;

import cn.sunshinehubery.service.mapper.UserMapper;
import cn.sunshinehubery.service.pojo.User;
import cn.sunshinehubery.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2019/8/26 12:04
 * @Version: 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User queryById(Long id) throws Exception {
        return userMapper.selectByPrimaryKey(id);
    }
}
