package com.project.project1.user.service;

import com.project.project1.user.dao.UserMapper;
import com.project.project1.user.dto.CreateUserDto;
import com.project.project1.user.vo.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@RequiredArgsConstructor
@Log4j2
@Service
public class UserService {
    private final UserMapper userMapper;

    @Transactional
    public void join (CreateUserDto dto) throws BadRequestException {
        int isExit = userMapper.getUserByUserId(dto.getUserId(), dto.getNickname());

        // id나 닉네임이 중복일 때
        if(isExit > 0) {
            throw new BadRequestException("이미 있는 아이디나 닉네임입니다.");
        }

        User createUser = dto.toEntity();
        userMapper.saveUser(createUser);
    }
}
