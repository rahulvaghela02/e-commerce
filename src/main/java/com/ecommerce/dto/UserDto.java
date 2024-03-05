package com.ecommerce.dto;

import com.ecommerce.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private long id;
    private String name;
    private String email;
    public String password;
    private UserRole userRole;


}
