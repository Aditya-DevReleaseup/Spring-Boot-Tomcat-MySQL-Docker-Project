package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    @Autowired
    private UserRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        repo.save(new User("Alice"));
        repo.save(new User("Bob"));
    }
}

@RestController
@RequestMapping("/users")
class UserController {
    @Autowired
    private UserRepository repo;

    @GetMapping
    public List<User> getUsers() {
        return repo.findAll();
    }
}