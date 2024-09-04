package com.pruebas.usuarios.controller;

import com.pruebas.usuarios.service.interfaces.IReportGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private IReportGenerator reportGenerator;

    // SRP - Single Responsibility Principle
    // El método tiene una única responsabilidad relacionada con la generación de reportes a través de la API.

    @GetMapping("/user")
    public String generateUserReport() {
        return reportGenerator.generateUserReport();
    }
}