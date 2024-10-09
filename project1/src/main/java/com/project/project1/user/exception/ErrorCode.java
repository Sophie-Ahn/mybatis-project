package com.project.project1.user.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    ONLY_SUPPORTED_KOREA(HttpStatus.BAD_REQUEST, "한국어만 가능"),
    ONLY_SUPPORTED_NUM(HttpStatus.BAD_REQUEST, "숫자만 가능");

    private final HttpStatus status;
    private final String message;
}
