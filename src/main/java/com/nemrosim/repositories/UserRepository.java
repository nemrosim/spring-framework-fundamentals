package com.nemrosim.repositories;

import com.nemrosim.models.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
}
