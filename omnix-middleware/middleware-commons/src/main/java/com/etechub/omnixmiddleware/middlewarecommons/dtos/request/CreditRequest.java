package com.etechub.omnixmiddleware.middlewarecommons.dtos.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditRequest {

    private String accountNumber;
    private double amount;
}
