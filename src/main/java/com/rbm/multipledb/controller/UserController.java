package com.rbm.multipledb.controller;

import com.rbm.multipledb.dao.user.UserRepository;
import com.rbm.multipledb.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rakshabm on 2020-03-16
 **/
@RestController
public class UserController {

    @Autowired UserRepository userRepository;

    @GetMapping("/user")
    public List<User> getUser()
    {
        return (List<User>) userRepository.findAll();
    }

}
