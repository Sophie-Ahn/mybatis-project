package com.project.project1.user.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ErrorResponse {
    private final String code;
    private final String message;
    private final HttpStatus status;
}
