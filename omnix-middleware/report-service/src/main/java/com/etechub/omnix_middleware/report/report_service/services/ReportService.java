package com.etechub.omnix_middleware.report.report_service.services;




import com.etechub.omnixmiddleware.middlewarecommons.dtos.request.ReportRequest;
import com.etechub.omnixmiddleware.middlewarecommons.dtos.response.ReportResponse;

import java.util.List;
import java.util.Optional;

public interface ReportService {

    ReportResponse saveReport(ReportRequest reportRequestDTO);

    List<ReportResponse> getAllReports();

    Optional<ReportResponse> getReportById(Long id);

    void deleteReport(Long id);
}
