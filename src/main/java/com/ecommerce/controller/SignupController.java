package com.ecommerce.controller;

import com.ecommerce.dto.SignupDto;
import com.ecommerce.dto.UserDto;
import com.ecommerce.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<?> signupUser(@RequestBody SignupDto signupDto){
        if(userService.hasUserWithEmail(signupDto.getEmail())){
            return new ResponseEntity<>("User Already Exist!!!",HttpStatus.NOT_ACCEPTABLE);
        }
       UserDto createdUser = userService.createUser(signupDto);
       if(createdUser == null){
           return new ResponseEntity<>("User not created.. Visit after some time....", HttpStatus.BAD_REQUEST);
       }
       return new ResponseEntity<>(createdUser,HttpStatus.CREATED);
    }
}
