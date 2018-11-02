package com.llz.controller;

import com.llz.bean.User;
import com.llz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/queryAll")
    public Object queryAll(){
        List<User> users = userService.queryAll();
        return users;
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @ResponseBody   //将返回对象放入响应体中
    @RequestMapping("/json")
    public Object json(){
        Map map = new HashMap<>();
        map.put("name","张三");
        map.put("age","2");
        return map;
    }
}
