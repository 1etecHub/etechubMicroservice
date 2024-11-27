package com.etechub.omnix_middleware.report.report_service.services.serviceImplementation;


import com.etechub.omnix_middleware.commons.middle_ware_commons.dtos.request.ReportRequest;
import com.etechub.omnix_middleware.commons.middle_ware_commons.dtos.response.ReportResponse;
import com.etechub.omnix_middleware.commons.middle_ware_commons.models.Report;
import com.etechub.omnix_middleware.report.report_service.repositories.ReportRepo;
import com.etechub.omnix_middleware.report.report_service.services.ReportService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ReportServiceImpl implements ReportService {


    private final ReportRepo reportRepository;

    @Override
    public ReportResponse saveReport(ReportRequest reportRequestDTO) {
        // Map RequestDTO to Entity
        Report report = new Report();
        report.setTitle(reportRequestDTO.getTitle());
        report.setDescription(reportRequestDTO.getDescription());

        // Save Entity
        Report savedReport = reportRepository.save(report);
        log.info("report saved" +savedReport.getId());

        // Map Entity to ResponseDTO
        return mapToResponseDTO(savedReport);
    }

    @Override
    public List<ReportResponse> getAllReports() {
        return reportRepository.findAll()
                .stream()
                .map(this::mapToResponseDTO) // Map each Report to ResponseDTO
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ReportResponse> getReportById(Long id) {
        return reportRepository.findById(id)
                .map(this::mapToResponseDTO); // Map Optional<Report> to Optional<ResponseDTO>
    }

    @Override
    public void deleteReport(Long id) {
        reportRepository.deleteById(id);
    }

    // Helper method to map Report to ReportResponseDTO
    private ReportResponse mapToResponseDTO(Report report) {
        ReportResponse responseDTO = new ReportResponse();
        responseDTO.setTitle(report.getTitle());
        responseDTO.setDescription(report.getDescription());
        return responseDTO;
    }

}
