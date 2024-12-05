package com.etechub.corebanking.corebanking_commons.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor

@Data
@Builder
@Entity
@Table(name = "wallet")

public class WalletAccount extends BaseEntity{

    private String accountNumber;
    private double balance;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
