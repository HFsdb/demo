package com.example.demo.dao;

import com.example.demo.entity.User;

import java.util.List;

public interface UserDao {
    public User select(String username,String password);
    public List<User> selectall();

}
