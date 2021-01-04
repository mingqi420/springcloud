package com.mingqi.service.service.impl;

import com.mingqi.service.dao.UserMapper;
import com.mingqi.service.domain.User;
import com.mingqi.service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User queryById(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
