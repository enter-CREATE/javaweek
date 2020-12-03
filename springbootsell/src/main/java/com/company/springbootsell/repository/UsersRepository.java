package com.company.springbootsell.repository;

import com.company.springbootsell.dataobject.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepository extends JpaRepository <Users,Integer>{
    Users findByUserNameAndPassword(String userName,String password);
}
