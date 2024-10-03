package com.project.project1.user.dto;

import com.project.project1.user.vo.User;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserDto {

    private String userId;
    private String userPassword;
    private String userName;
    private String nickname;
    private String phoneNum;

    public User toEntity() {
        return new User(
                this.userId,
                this.userPassword,
                this.userName,
                this.nickname,
                this.phoneNum
        );
    }
}
