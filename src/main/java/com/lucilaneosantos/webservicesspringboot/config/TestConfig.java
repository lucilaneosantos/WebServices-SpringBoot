package com.lucilaneosantos.webservicesspringboot.config;

import com.lucilaneosantos.webservicesspringboot.entities.User;
import com.lucilaneosantos.webservicesspringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
         User u1 = new User(null, "Maria Brown", "maria@gmail", "988888888", "123456");
         User u2 = new User(null, "Alex Green", "alex@gmail", "977777777", "123456");

         userRepository.saveAll(Arrays.asList(u1, u2));
    }

}
