package com.project.project1.user.vo;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Builder
public class Attach {
    private Integer id;
    private String originalName;
    private String storedName;
    private String savePath;
    private Integer userId;

    public Attach (String originalName, String storedName, String savePath, Integer userId) {
        this.originalName = originalName;
        this.storedName = storedName;
        this.savePath = savePath;
        this.userId = userId;
    }
}
