package com.project.project1.user.dao;

import com.project.project1.user.dto.CreateUserDto;
import com.project.project1.user.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

@Mapper
public interface UserMapper {
    // 회원가입
    void saveUser(User user);

    // 회원 존재하는지
    int getUserByUserId (@Param("userId") String userId, @Param("nickname") String nickname);

    // 로그인
    Optional<User> findUserById(@Param("userId") String userId, @Param("password") String userPassword);
}
