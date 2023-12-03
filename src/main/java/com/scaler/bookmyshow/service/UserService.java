package com.scaler.bookmyshow.service;

import com.scaler.bookmyshow.models.Region;
import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public void addUser(User user){
        userRepository.save(user);
    }
    public User findUserById(Long id){
        return userRepository.findById(id).get();
    }
    public List<User> findAllUser(){
        return userRepository.findAll();
    }
}
