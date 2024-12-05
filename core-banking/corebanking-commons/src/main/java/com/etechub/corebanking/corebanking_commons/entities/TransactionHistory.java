package com.etechub.corebanking.corebanking_commons.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transaction_history")
public class TransactionHistory extends BaseEntity{


    @Column(nullable = false)
    private String description;

    @Column(name = "transaction_date", nullable = false)
    private LocalDateTime transactionDate;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
