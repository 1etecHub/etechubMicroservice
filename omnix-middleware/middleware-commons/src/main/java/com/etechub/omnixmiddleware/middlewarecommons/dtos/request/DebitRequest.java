package com.etechub.omnixmiddleware.middlewarecommons.dtos.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DebitRequest {

    private String accountNumber;
    private double amount;
}
