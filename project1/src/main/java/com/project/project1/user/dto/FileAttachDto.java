package com.project.project1.user.dto;

import com.project.project1.user.vo.Attach;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileAttachDto {
    private String originalName;
    private String storedName;
    private String savePath;
    private Integer userId;

    public static Attach toEntity(String originalName, String storedName, String savePath, Integer userId){
        return Attach.builder()
                .originalName(originalName)
                .storedName(storedName)
                .savePath(savePath)
                .userId(userId)
                .build();
    }
}
