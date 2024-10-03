package com.project.project1.dao;

import com.project.project1.board.dao.BoardMapper;
import com.project.project1.board.vo.Board;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@MapperScan("com.project.project1.board")
public class BoardMapperTests {
    @Autowired
    private BoardMapper boardMapper;

    @Test
    public void testFindById(){
        Board board = boardMapper.findById(1);
        assertNotNull(board);
        assertEquals("test", board.getTitle());
    }
}
