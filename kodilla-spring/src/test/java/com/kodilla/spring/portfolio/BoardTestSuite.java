package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Autowired
    private TaskList toDoList;

    @Test
    void testBoard() {
        //Given
        toDoList.getTasks().add("Task 1");

        //When
        String result = board.getToDoList().getTasks().get(0);

        //Then
        assertEquals("Task 1", result);
    }
}
