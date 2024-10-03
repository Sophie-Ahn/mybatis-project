package com.project.project1.user.vo;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class User {

    private Integer id;
    private String userId;
    private String userPassword;
    private String userName;
    private String nickname;
    private String phoneNum;

    public User(String userId, String nickname, String userName, String userPassword, String phoneNum) {
        this.userId = userId;
        this.nickname = nickname;
        this.userName = userName;
        this.userPassword = userPassword;
        this.phoneNum = phoneNum;
    }
}
