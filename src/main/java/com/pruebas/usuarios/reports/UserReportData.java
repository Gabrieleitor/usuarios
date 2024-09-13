package com.pruebas.usuarios.reports;


public class UserReportData {
    private final String name;
    private final String email;
    private final String type;

    public UserReportData(String name, String email, String type) {
        this.name = name;
        this.email = email;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getType() {
        return type;
    }
}
