package com.ritual.growth.ritual.growth.web;

import com.ritual.growth.ritual.growth.entties.User;
import com.ritual.growth.ritual.growth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {


    @Autowired
    private UserService userService;


    @QueryMapping
    public List<User> listOfUsers(){
        return userService.getAllUsers();
    }

    @QueryMapping
    public User getUserById(@Argument Long userId){
        return userService.getUserById(userId);
    }


}
