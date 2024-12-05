package com.etechub.corebanking.corebanking_commons.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Transfers")
public class Transfer extends BaseEntity{
    private String sourceAccountNumber;
    private String destinationAccountNumber;
    private BigDecimal amount;
}
