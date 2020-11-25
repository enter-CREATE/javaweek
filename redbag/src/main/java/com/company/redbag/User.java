package com.company.redbag;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tb_user")
public class User {
    /**
     * 指定主键为uuid增长
     */
    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    //主键id
    private String id;
    //用户名
    @Column(name = "username",unique = true,nullable = false,length = 64)
    private String username;
    //密码
    @Column(name = "password",nullable = false,length = 64)
    private String password;
    //邮箱
    @Column(name = "email",length = 64)
    private String email;
    public User(){

    }
}
