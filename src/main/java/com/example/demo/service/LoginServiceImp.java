package com.example.demo.service;

import com.example.demo.dao.UserDaoImp;
import com.example.demo.entity.User;

public class LoginServiceImp implements LoginService{
    @Override
    public boolean login(String username, String password) {
        UserDaoImp udi = new UserDaoImp();
        User user = udi.select(username,password);
        if(user == null) {
            return false;
        }


        return true;
    }
}
