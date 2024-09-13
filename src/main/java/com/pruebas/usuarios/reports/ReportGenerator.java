package com.pruebas.usuarios.reports;

import java.util.List;

public interface ReportGenerator {
    String generateReport(List<UserReportData> userDataList);
}
