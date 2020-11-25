package com.company.redbag;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {
    @Autowired
    private UserRepository repository;

    /**
     * 查找所有
     */
    @Test
    public void findAll(){
        List<User> list=repository.findAll();
        for (User user:list){
            System.out.println(user);
        }
    }
    /**
     * 通过id查找
     */
    @Test
    public void findById(){
        String id="8a04af6f75fea5b30175fea5baa00000";
        Optional<User> optional = repository.findById(id);
        User user=optional.get();
        System.out.println(user);
    }
    /**
     * 添加
     */
    @Test
    public void save(){
        User user=new User();
        user.setUsername("阿童木");
        user.setPassword("6889");
        user.setEmail("423516@qq.com");
        repository.save(user);
    }

    /**
     * 删除
     */
    @Test
    public void delete(){
        repository.deleteById("8a04af6f75fea5b30175fea5baa00000");
    }

    /**
     * 更新
     */
    @Test
    public void update(){
        User user=new User();
        user.setUsername("马冬梅");
        user.setPassword("112458");
        user.setId("8a04af6f75fea5b30175fea5baa00000");
        user.setEmail("123@qq.com");
        repository.save(user);
    }
}
