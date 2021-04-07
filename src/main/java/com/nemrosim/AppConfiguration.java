package com.nemrosim;

import com.nemrosim.repositories.HibernateUserRepositoryImpl;
import com.nemrosim.repositories.UserRepository;
import com.nemrosim.services.UserService;
import com.nemrosim.services.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean(name = "userService")
    public UserService getUserService() {
        UserServiceImpl service =  new UserServiceImpl();
        service.setRepository(getUserRepository());
        return service;
    }

    @Bean(name = "userRepository")
    public UserRepository getUserRepository() {
        return new HibernateUserRepositoryImpl();
    }
}
