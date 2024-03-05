package com.ecommerce.service.user;

import com.ecommerce.dto.SignupDto;
import com.ecommerce.dto.UserDto;

public interface UserService {
    UserDto createUser(SignupDto signupDto);

    boolean hasUserWithEmail(String email);
}
