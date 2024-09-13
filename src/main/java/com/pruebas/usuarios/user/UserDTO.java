package com.pruebas.usuarios.user;

public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String type;
    private double salary;

    public UserDTO(Long id, String name, String email, String type, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.type = type;
        this.salary = salary;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
