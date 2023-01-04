package com.example.pdfexletcgenerator.repo;

import com.example.pdfexletcgenerator.models.Role;
import com.example.pdfexletcgenerator.models.User;

import java.util.List;
import java.util.Set;

public class UserRepository {
    public static List<User> getAllUser(){
        return List.of(
                new User("abc@gmail.com","password", true, Set.of(new Role("ADMIN"), new Role("USER"))),
                new User("abc@gmail.com","password", true, Set.of(new Role("ADMIN"), new Role("USER"))),
                new User("abc@gmail.com","password", true, Set.of(new Role("ADMIN"), new Role("USER"))),
                new User("abc@gmail.com","password", true, Set.of(new Role("ADMIN"), new Role("USER"))),
                new User("abc@gmail.com","password", true, Set.of(new Role("ADMIN"), new Role("USER"))),
                new User("abc@gmail.com","password", true, Set.of(new Role("ADMIN"), new Role("USER"))),
                new User("abc@gmail.com","password", true, Set.of(new Role("USER"))),
                new User("abc@gmail.com","password", true, Set.of(new Role("ADMIN"), new Role("USER"))),
                new User("abc@gmail.com","password", true, Set.of(new Role("ADMIN"), new Role("USER"))),
                new User("abc@gmail.com","password", false, Set.of(new Role("ADMIN"), new Role("USER"))),
                new User("abc@gmail.com","password", true, Set.of(new Role("USER"))),
                new User("abc@gmail.com","password", true, Set.of(new Role("ADMIN")))
        );
    }
}
