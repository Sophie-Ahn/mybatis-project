package com.project.project1.user.dao;

import com.project.project1.user.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    // 회원가입
    void saveUser(User user);

    // 로그인
    String findUserById(@Param("userId") String userId, @Param("userPassword") String userPassword);
}
