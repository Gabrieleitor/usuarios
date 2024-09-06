package com.pruebas.usuarios.user;


public abstract class User {
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

    public abstract UserType getType();

    public abstract double calculateSalary();

    public String toString() {
        return "User{name='" + name + "', email='" + email + "', type='" + type + "'}";
    }
}