package com.llz.service.impl;

import com.llz.bean.User;
import com.llz.dao.UserDao;
import com.llz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }

    @Override
    public User query4Login(User user) {
        return userDao.query4Login(user);
    }
}
