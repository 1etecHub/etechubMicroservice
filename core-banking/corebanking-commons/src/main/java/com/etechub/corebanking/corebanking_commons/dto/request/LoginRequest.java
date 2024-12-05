package com.etechub.corebanking.corebanking_commons.dto.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonDeserialize
public class LoginRequest {

    @NotBlank(message = "email cannot be empty")
    @Email(message = "Must be a valid email!")
    private String email;
    @NotBlank(message = "phone number cannot be empty")
    @Size(message = "phone number is required")
    private String phoneNumber;
    @NotBlank(message = " password cannot be empty")
    @Size(message = "Password must be greater than 6 and less than 20", min = 6, max = 20)
    private String password;
}
