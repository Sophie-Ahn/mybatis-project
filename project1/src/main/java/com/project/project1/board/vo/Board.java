package com.project.project1.board.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {
    private Integer boardId;
    private String title;
    private String subject;
    private String writer;
    private Date createDtm;
    private Date modifyDtm;
}
