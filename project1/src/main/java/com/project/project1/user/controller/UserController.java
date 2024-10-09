package com.project.project1.user.controller;

import com.project.project1.user.dto.JoinResponseDto;
import com.project.project1.user.dto.JoinUserDto;
import com.project.project1.user.exception.GlobalException;
import com.project.project1.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @PostMapping("/join")
    public ResponseEntity<JoinResponseDto> joinUser(JoinUserDto joinUserDto, @RequestPart (value = "multipartFile")MultipartFile image) throws GlobalException, IOException {
            JoinResponseDto dto = userService.join(joinUserDto, image);
            return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }

//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody LoginUserDto loginUserDto) throws BadRequestException {
//        String nickname = userService.login(loginUserDto);
//        return ResponseEntity.status(HttpStatus.ACCEPTED).body(nickname + " 로그인 완료");
//    }
//
//    @ExceptionHandler(BadRequestException.class)
//    public String handleException(Exception e) {
//        return e.getMessage();
//    }
}
