package com.etechub.remit_one.report_service.services;


import com.etechub.remit_one_commons.dtos.request.ReportRequest;
import com.etechub.remit_one_commons.dtos.response.ReportResponse;

import java.util.List;
import java.util.Optional;

public interface ReportService {

    ReportResponse saveReport(ReportRequest reportRequestDTO);

    List<ReportResponse> getAllReports();

    Optional<ReportResponse> getReportById(Long id);

    void deleteReport(Long id);
}
