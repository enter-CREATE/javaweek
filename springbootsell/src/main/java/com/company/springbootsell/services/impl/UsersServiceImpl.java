package com.company.springbootsell.services.impl;

import com.company.springbootsell.dataobject.Users;
import com.company.springbootsell.repository.UsersRepository;
import com.company.springbootsell.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    UsersRepository repository;

    public Users findByUserNameAndPassword(String userName,String password){
        return repository.findByUserNameAndPassword(userName,password);
    }
}
