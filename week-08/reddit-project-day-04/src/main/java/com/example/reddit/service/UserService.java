package com.example.reddit.service;

import com.example.reddit.model.User;
import com.example.reddit.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User userLogin(String name) {
        return userRepository.findByName(name);
    }
}
