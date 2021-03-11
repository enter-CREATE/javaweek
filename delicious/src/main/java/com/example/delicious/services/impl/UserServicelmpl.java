package com.example.delicious.services.impl;

import com.example.delicious.dataobject.User;
import com.example.delicious.repository.UserRepository;
import com.example.delicious.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicelmpl implements UserService {
    @Autowired
    UserRepository repository;

    public User findByUserNameAndPassword(String userName,String password){
        return repository.findByUserNameAndPassword(userName, password);
    }
}
