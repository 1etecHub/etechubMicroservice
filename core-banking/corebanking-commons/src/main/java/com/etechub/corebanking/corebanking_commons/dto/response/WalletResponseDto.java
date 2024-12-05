package com.etechub.corebanking.corebanking_commons.dto.response;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WalletResponseDto {

    private String accountNumber;
    private String accountName;
    private String bankName;
}
