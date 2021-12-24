package com.example.demo.control;

import com.example.demo.service.LoginServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Login {
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private HttpServletResponse response;

    @GetMapping ("/login")
    public String login(){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        LoginServiceImp loginServiceImp = new LoginServiceImp();
        boolean b = loginServiceImp.login(username,password);
        if(b == true){
            return "forword:index.html";

        }
        return "redirect:login.html";

    }
}
