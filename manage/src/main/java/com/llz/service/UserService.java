package com.llz.service;

import com.llz.bean.User;

import java.util.List;

public interface UserService {
    List<User> queryAll();

    User query4Login(User user);
}
