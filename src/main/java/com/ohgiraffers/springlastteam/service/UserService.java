package com.ohgiraffers.springlastteam.service;


import com.ohgiraffers.springlastteam.entity.Users;
import com.ohgiraffers.springlastteam.login.dto.UserDTO;


public interface UserService {
    Users login(UserDTO userDTO);
    void register(UserDTO userDTO) throws Exception;
}