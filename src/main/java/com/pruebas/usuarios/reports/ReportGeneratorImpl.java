package com.pruebas.usuarios.reports;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportGeneratorImpl implements ReportGenerator{
    @Override
    public String generateReport(List<UserReportData> userDataList) {
        StringBuilder report = new StringBuilder("User Report:\n");
        for (UserReportData userData : userDataList) {
            report.append(visitUser(userData)).append("\n");
        }
        return report.toString();
    }

    public String visitUser(UserReportData userData) {
        return String.format("Name: %s, Email: %s, Type: %s",
                userData.getName(), userData.getEmail(), userData.getType());
    }
}
