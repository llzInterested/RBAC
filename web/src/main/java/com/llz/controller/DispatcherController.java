package com.llz.controller;

import com.llz.bean.User;
import com.llz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class DispatcherController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        //session.removeAttribute("loginUser");
        session.invalidate();
        return "redirect:login";
    }

    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/error")
    public String error() {
        return "error";
    }

    @RequestMapping("/doAJAXLogin")
    public String doLogin(User user, Model model){
        User dbUser = userService.query4Login(user);
        if(dbUser == null){
            String errorMsg = "用户名或密码错误";
            model.addAttribute("",errorMsg);
            return "login";
        }else{
            return "main";
        }
    }
}
