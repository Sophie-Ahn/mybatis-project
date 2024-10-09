package com.project.project1.user.dto;

import com.project.project1.user.dao.Grade;
import com.project.project1.user.vo.User;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JoinUserDto {

    private String userId;
    private String password;
    private String username;
    private String address;
    private String detailAddress;
    private String zipcode;
    private String phoneNum;
    private Grade grade;

    public User toEntity() {
        return new User(
                this.userId,
                this.password,
                this.username,
                this.address,
                this.detailAddress,
                this.zipcode,
                this.phoneNum,
                this.grade
        );
    }
}
