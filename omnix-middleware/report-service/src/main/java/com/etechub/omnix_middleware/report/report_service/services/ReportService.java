package com.etechub.omnix_middleware.report.report_service.services;


import com.etechub.omnix_middleware.commons.middle_ware_commons.dtos.request.ReportRequest;
import com.etechub.omnix_middleware.commons.middle_ware_commons.dtos.response.ReportResponse;
import com.etechub.omnix_middleware.commons.middle_ware_commons.models.Report;

import java.util.List;
import java.util.Optional;

public interface ReportService {

    ReportResponse saveReport(ReportRequest reportRequestDTO);

    List<ReportResponse> getAllReports();

    Optional<ReportResponse> getReportById(Long id);

    void deleteReport(Long id);
}
