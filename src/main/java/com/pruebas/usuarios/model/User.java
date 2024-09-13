package com.pruebas.usuarios.model;


import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserType type;


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public UserType getType() {
        return type;
    }


    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "', type='" + type + "'}";
    }
}
