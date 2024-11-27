package com.etechub.remit_one.report_service.repositories;


import com.etechub.remit_one_commons.models.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReportRepo extends JpaRepository<Report, Long> {

    Optional<Report> findById(Long orderId);
}
