package com.project.project1.user.service;

import com.project.project1.user.dao.UserMapper;
import com.project.project1.user.dto.FileAttachDto;
import com.project.project1.user.dto.JoinResponseDto;
import com.project.project1.user.dto.JoinUserDto;
import com.project.project1.user.exception.ErrorCode;
import com.project.project1.user.exception.GlobalException;
import com.project.project1.user.vo.Attach;
import com.project.project1.user.vo.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.regex.Pattern;

@RequiredArgsConstructor
@Log4j2
@Service
public class UserService {
    private final UserMapper userMapper;

    @Transactional
    public JoinResponseDto join (JoinUserDto dto, MultipartFile image) throws IOException {

        if(!Pattern.matches("^[ㄱ-ㅎ가-힣]*$", dto.getUsername())) {
            return new JoinResponseDto("0001", "한글만 작성 가능");
//            throw new GlobalException(ErrorCode.ONLY_SUPPORTED_KOREA);
        }
        if(!Pattern.matches("^(?=.*[A-Za-z])(?=.*[0-9])[a-zA-Z0-9]+$", dto.getUserId())) {
            return new JoinResponseDto("0002", "영어+숫자만 가능");
        }
        if(!Pattern.matches("^[0-9]*$", dto.getPhoneNum())) {
            return new JoinResponseDto("0003", "숫자도 아닌것이... - 도 안됨");
        }

        User createUser = dto.toEntity();
        userMapper.saveUser(createUser);
        System.out.println(createUser);
        // 프로필 이미지
        UUID uuid = UUID.randomUUID();
        String filename = uuid.toString() + "_" + image.getOriginalFilename();
        File profileImg = new File("/Users/seulkian/upload/", filename);
        image.transferTo(profileImg);
        Attach fileImg = FileAttachDto.toEntity(image.getOriginalFilename(), filename, "/Users/seulkian/upload/", createUser.getId());

        return new JoinResponseDto("0000", "회원가입 잘되었음");
    }

//    public String login (LoginUserDto dto) throws BadRequestException {
//        String loginUser = userMapper.findUserById(dto.getUserId(), dto.getUserPassword());
////        User loginUser = userMapper.findUserById(dto.getUserId(), dto.getUserPassword());
////        String user = loginUser.fromEntity();
//        if(loginUser == null) {
//            throw new BadRequestException("존재하지 않은 회원이거나 오타남");
//        }
//
//        return loginUser;
//    }
}
