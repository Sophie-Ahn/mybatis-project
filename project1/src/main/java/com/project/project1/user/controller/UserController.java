package com.project.project1.user.controller;

import com.project.project1.user.dto.CreateUserDto;
import com.project.project1.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody CreateUserDto createUserDto) throws BadRequestException {
            userService.join(createUserDto);
            return ResponseEntity.status(HttpStatus.CREATED).body("회원가입 됐다.");
    }

    @ExceptionHandler(BadRequestException.class)
    public String handleException(Exception e) {
        return e.getMessage();
    }
}
