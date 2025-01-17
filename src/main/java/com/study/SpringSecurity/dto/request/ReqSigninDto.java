package com.study.SpringSecurity.dto.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ReqSigninDto {

    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
