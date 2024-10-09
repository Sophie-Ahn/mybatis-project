package com.project.project1.user.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GlobalException extends Exception {
    private ErrorCode errorCode;
}
