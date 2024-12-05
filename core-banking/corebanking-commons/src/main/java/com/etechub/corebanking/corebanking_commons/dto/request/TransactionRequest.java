package com.etechub.corebanking.corebanking_commons.dto.request;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonDeserialize
public class TransactionRequest {

    private String senderAccount;
    private String recipientAccount;
    private double amount;
}
