package cn.sunshinehubery.user.service.impl;

import cn.sunshinehubery.user.mapper.UserMapper;
import cn.sunshinehubery.user.pojo.User;
import cn.sunshinehubery.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2019/8/23 21:55
 * @Version: 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findById(Long id) throws Exception {
            return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> list() throws Exception {
        return userMapper.selectAll();
    }
}
