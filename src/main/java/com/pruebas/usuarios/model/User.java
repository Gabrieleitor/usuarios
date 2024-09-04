package com.pruebas.usuarios.model;


import com.pruebas.usuarios.model.enums.UserType;

public class User {
    private String id;
    private String name;
    private String email;
    private String password;
    private UserType type;

    public double calculateSalary() {
        switch (type) {
            case EMPLOYEE:
                return 50000;
            case MANAGER:
                return 80000;
            case EXECUTIVE:
                return 120000;
            default:
                return 0;
        }
    }

    public String getId() {
        return id;
    }

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

    public User(String id, String name, String email, String password, UserType type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "', type='" + type + "'}";
    }
}

