package com.example.user.service;

import com.example.user.model.User;

import java.util.List;

public interface UserService {


   public User addUser(User user);

    public List<User> addAllUsers(List<User> users);


    public User getUser(long id);

    public List<User> getAllUser();

   public User UpdateUser(long id,User user);
}
