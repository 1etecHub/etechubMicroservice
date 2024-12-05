package com.etechub.corebanking.corebanking_commons.dto.response;


import com.etechub.corebanking.corebanking_commons.enums.Roles;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponse {
    private String firstName;
    private String lastName;
    private String token;
    private String email;
    private Roles role;

}

