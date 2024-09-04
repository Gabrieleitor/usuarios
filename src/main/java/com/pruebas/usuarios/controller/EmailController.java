package com.pruebas.usuarios.controller;

import com.pruebas.usuarios.service.interfaces.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/email")
public class EmailController {

    @Autowired
    private IEmailService emailService;

    // SRP - Single Responsibility Principle
    // Cada método tiene una única responsabilidad relacionada con el envío de correos electrónicos a través de la API.

    @PostMapping("/welcome/{id}")
    public ResponseEntity<?> sendWelcomeEmail(@PathVariable String id) {
        emailService.sendWelcomeEmail(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/promotion/{id}")
    public ResponseEntity<?> sendPromotionEmail(@PathVariable String id) {
        emailService.sendPromotionEmail(id);
        return ResponseEntity.noContent().build();
    }
}