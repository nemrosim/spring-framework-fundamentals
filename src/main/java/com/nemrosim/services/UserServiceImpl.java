package com.nemrosim.services;

import com.nemrosim.models.User;
import com.nemrosim.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    public UserServiceImpl() {
        System.out.println("UserServiceImpl default constructor");
    }

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        System.out.println("UserServiceImpl repository constructor");
        this.repository = repository;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    public void setRepository(UserRepository repository) {
        System.out.println("UserServiceImpl setter");
        this.repository = repository;
    }
}
