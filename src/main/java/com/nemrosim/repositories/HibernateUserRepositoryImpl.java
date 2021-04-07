package com.nemrosim.repositories;

import com.nemrosim.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("userRepository")
public class HibernateUserRepositoryImpl implements UserRepository {

    @Override
    public List<User> findAll(){
        List<User> list = new ArrayList<User>();

        User user1 = new User("John", "Doe");
        User user2 = new User("Bruce", "Wayne");

        list.add(user1);
        list.add(user2);

        return list;
    }
}
