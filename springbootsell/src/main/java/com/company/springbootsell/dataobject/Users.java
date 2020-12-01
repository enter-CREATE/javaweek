package com.company.springbootsell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Users {
    @Id
    private String userName;
    private String password;
}
