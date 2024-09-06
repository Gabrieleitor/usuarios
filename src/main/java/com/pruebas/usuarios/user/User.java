package com.pruebas.usuarios.user;


public class User {
    private String name;
    private String email;
    private String password;
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