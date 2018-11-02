package com.llz.dao;

import com.llz.bean.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("select * from user")
    List<User> queryAll();

    @Select("select * from user where u_name = #{uName} and u_pwd = #{uPwd}")
    User query4Login(User user);
}
