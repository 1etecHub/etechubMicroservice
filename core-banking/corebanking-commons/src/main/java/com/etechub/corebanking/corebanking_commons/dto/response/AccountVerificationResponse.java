package com.etechub.corebanking.corebanking_commons.dto.response;

import com.goCash.entities.AccountData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AccountVerificationResponse {
    private String status;
    private String message;
    private AccountData data;
}
