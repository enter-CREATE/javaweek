package com.company.redbag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping("/list")
    public List<User> list(){
        return repository.findAll();
    }

    @PostMapping("/post")
    public User postUser(@RequestParam(value = "username",required = true)String username,@RequestParam(value = "password",required = true)String password){
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        return repository.save(user);
    }

    @GetMapping("/find/{id}")
    public User findById(@PathVariable("id")String id){
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/put/{id}")
    public User put(@PathVariable("id")String id,
                    @RequestParam("username")String username,
                    @RequestParam("password")String password){
        Optional<User> optional = repository.findById(id);
        if (optional.isPresent()){
            User user=optional.get();
            user.setUsername(username);
            user.setPassword(password);
            return repository.save(user);
        }
        return null;
    }
}
