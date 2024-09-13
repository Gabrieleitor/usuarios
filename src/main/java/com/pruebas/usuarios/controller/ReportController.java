package com.pruebas.usuarios.controller;

import com.pruebas.usuarios.reports.ReportGenerator;
import com.pruebas.usuarios.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reports")
public class ReportController {
    private final UserService userService;
    private final ReportGenerator reportGenerator;

    @Autowired
    public ReportController(UserService userService, ReportGenerator reportGenerator) {
        this.userService = userService;
        this.reportGenerator = reportGenerator;
    }

    @GetMapping("/users")
    public ResponseEntity<String> getUserReport() {
        String report = reportGenerator.generateReport(userService.getUserReportData());
        return ResponseEntity.ok(report);
    }
}
