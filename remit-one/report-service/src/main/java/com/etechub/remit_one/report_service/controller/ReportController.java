package com.etechub.remit_one.report_service.controller;


import com.etechub.remit_one.report_service.services.ReportService;
import com.etechub.remit_one_commons.dtos.request.ReportRequest;
import com.etechub.remit_one_commons.dtos.response.ApiResponse;
import com.etechub.remit_one_commons.dtos.response.ReportResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
@RequiredArgsConstructor
public class ReportController {


    private final ReportService reportService;

    // Create a new report
    @PostMapping("/create")
    public ResponseEntity<ReportResponse> createReport(@RequestBody ReportRequest reportRequestDTO) {
        ReportResponse savedReport = reportService.saveReport(reportRequestDTO);
        return ResponseEntity.ok(savedReport);
    }

    // Get all reports
    @GetMapping("/all-reports")
    public ResponseEntity<List<ReportResponse>> getAllReports() {
        List<ReportResponse> reports = reportService.getAllReports();
        return ResponseEntity.ok(reports);
    }

    // Get a report by ID
    @GetMapping("/report/{id}")
    public ResponseEntity<ReportResponse> getReportById(@PathVariable Long id) {
        return reportService.getReportById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Update a report
    @PutMapping("/delete/{id}")
    public ResponseEntity<ReportResponse> updateReport(@PathVariable Long id, @RequestBody ReportRequest updatedReportDTO) {
        return reportService.getReportById(id)
                .map(existingReport -> {
                    ReportResponse updatedReport = reportService.saveReport(updatedReportDTO);
                    return ResponseEntity.ok(updatedReport);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // Delete a report
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteReport(@PathVariable Long id) {
        if (reportService.getReportById(id).isPresent()) {
            reportService.deleteReport(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
