package com.example.springboot.service;

import com.example.springboot.entity.User;

import java.util.List;

public interface IUserMapper {
    List<User> listUsers();
}
