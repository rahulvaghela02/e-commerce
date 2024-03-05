package com.ecommerce.dto;

import lombok.Data;

@Data
public class SignupDto {
    private String name;
    private String email;
    public String password;
}
