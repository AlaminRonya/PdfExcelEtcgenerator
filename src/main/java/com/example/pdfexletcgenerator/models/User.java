package com.example.pdfexletcgenerator.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
public class User {
    private String email;
    private String password;
    private boolean enabled;
    private Set<Role> roles = new HashSet<>();
}
