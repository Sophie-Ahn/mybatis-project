package com.project.project1.board.dao;

import com.project.project1.board.vo.Board;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BoardMapper {
    Board findById(@Param("id") int id);
}
