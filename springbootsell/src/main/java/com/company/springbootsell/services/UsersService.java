package com.company.springbootsell.services;

import com.company.springbootsell.dataobject.Users;

public interface UsersService {
    //登录
    Users findByUserNameAndPassword(String userName,String password);
}
