package com.example.user.service.impl;

import com.example.user.model.User;
import com.example.user.repository.UserRepository;
import com.example.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    public User addUser(User user){
        return userRepository.save(user);
    }

    @Override
    public List<User> addAllUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

    @Override
    public User getUser(long id) {
        Optional<User> optUser= userRepository.findById(id);
        if(optUser.isPresent()){
          User user = optUser.get();
         return user;
        }else{
            log.info("User Not found");
            return null;
        }
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User UpdateUser(long id,User user ) {
       Optional<User> OptUser = userRepository.findById(id);
        if(OptUser.isPresent()){
           User user1= OptUser.get();
           user1.setName(user.getName());
           user1.setPassword(user.getPassword());
           return user1;
        }else{
            log.info("name not found");
            return null;

        }
    }


}
