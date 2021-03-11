package com.example.delicious.repository;

import com.example.delicious.dataobject.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserNameAndPassword(String userName,String password);
}
