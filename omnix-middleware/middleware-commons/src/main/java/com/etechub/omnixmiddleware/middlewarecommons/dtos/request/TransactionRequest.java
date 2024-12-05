package com.etechub.omnixmiddleware.middlewarecommons.dtos.request;


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
