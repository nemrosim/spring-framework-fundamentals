package com.nemrosim;

import com.nemrosim.models.User;
import com.nemrosim.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        UserService service = context.getBean("userService", UserService.class);

        User user = service.findAll().get(0);

        System.out.println(user.getFirstName());
    }
}
