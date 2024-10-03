package com.project.project1.user.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginUserDto {
    private String userId;
    private String userPassword;
}
