package com.ritual.growth.ritual.growth.service;

import com.ritual.growth.ritual.growth.entties.User;
import com.ritual.growth.ritual.growth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


   @Autowired
   private UserRepository userRepository;






   public List<User> getAllUsers(){
       return userRepository.findAll();
   }

   public User getUserById(Long userId){
       return userRepository.findById(userId).orElse(null);
   }
}
