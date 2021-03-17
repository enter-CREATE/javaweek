package com.example.delicious.services;

import com.example.delicious.dataobject.User;


public interface UserService {
    User findByUserNameAndPassword(String userName,String password);

}