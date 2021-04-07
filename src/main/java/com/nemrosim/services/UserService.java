package com.nemrosim.services;

import com.nemrosim.models.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
