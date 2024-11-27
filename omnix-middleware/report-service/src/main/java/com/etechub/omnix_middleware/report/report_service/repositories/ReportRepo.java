package com.etechub.omnix_middleware.commons.middle_ware_commons.repositories;

import com.etechub.omnix_middleware.commons.middle_ware_commons.models.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReportRepo extends JpaRepository<Report, Long> {

    Optional<Report> findById(Long orderId);
}
