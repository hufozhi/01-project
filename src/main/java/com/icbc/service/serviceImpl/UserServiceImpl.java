package com.icbc.service.serviceImpl;

import com.icbc.mapper.UserMapper;
import com.icbc.pojo.User;
import com.icbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findById(Long id) {
        User user = userMapper.findById(id);
        return user;
    }
}
