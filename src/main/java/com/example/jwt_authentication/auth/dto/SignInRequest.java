package com.example.jwt_authentication.auth.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class SignInRequest {
    @NotEmpty
    private String email;

    @NotEmpty
    private String password;
}
