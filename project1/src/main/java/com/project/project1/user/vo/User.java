package com.project.project1.user.vo;

import com.project.project1.user.dao.Grade;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class User {

    private Integer id;
    private String userId;
    private String password;
    private String username;
    private String address;
    private String detailAddress;
    private String zipcode;
    private String phoneNum;
    private Grade grade;
    private Character deleteYn;
    private Character lockYn;
    private Integer failcnt;
    private LocalDateTime creDate;
    private LocalDateTime modDate;

    public User(String userId, String password, String username, String address, String detailAddress, String zipcode, String phoneNum, Grade grade) {
        this.userId = userId;
        this.password = password;
        this.username = username;
        this.address = address;
        this.detailAddress = detailAddress;
        this.zipcode = zipcode;
        this.phoneNum = phoneNum;
        this.grade = grade;
        this.deleteYn = 'N';
        this.lockYn = 'N';
        this.creDate = LocalDateTime.now();
        this.failcnt = 0;
    }

}
