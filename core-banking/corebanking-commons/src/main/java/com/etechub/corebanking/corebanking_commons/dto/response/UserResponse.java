package com.etechub.corebanking.corebanking_commons.dto.response;

import lombok.Data;

@Data
public class UserResponse {
    private String firstName;
    private String lastName;
    private String accountNumber;
    private String email;
}
