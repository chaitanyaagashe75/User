package com.example.user.controller;

import com.example.user.model.User;

import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User User){
        return userService.addUser(User);
    }

    @PostMapping("/addAll")
   public List<User> addAllUsers(@RequestBody List<User> users){
        return userService.addAllUsers(users);
    }

    @GetMapping("/get")
    public User getUser(@RequestParam long id){
        return userService.getUser(id);
    }

    @GetMapping("/getAll")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PutMapping("/update/{id}")
    public User UpdateUser(@PathVariable long id,@RequestBody User user){
        return userService.UpdateUser(id,user);
    }

}
