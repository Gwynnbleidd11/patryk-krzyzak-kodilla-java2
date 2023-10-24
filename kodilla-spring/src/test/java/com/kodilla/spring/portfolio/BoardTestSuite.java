package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void testBoardClass() {
        //Given

        //When
        board.getDoneList();
        board.getInProgressList();
        board.getToDoList();

        //Then
    }

    @Test
    void testTaskAdd() {
        //Given

        //When
        board.addToDoList("Shopping");
        board.addToDoList("Walk with dog");
        board.addInProgressList("Laundry");
        board.addDoneList("Bills");
        board.addDoneList("Dinner");
        board.addDoneList("Dishwasher");


        int toDoListSize = board.getToDoList().getTasks().size();
        int inProgressListSize = board.getInProgressList().getTasks().size();
        int doneListSize = board.getDoneList().getTasks().size();

        String toDoListContent = board.getToDoList().getTasks().get(1);
        String inProgressListContent = board.getInProgressList().getTasks().get(0);
        String doneListContent = board.getDoneList().getTasks().get(2);

        //Then
        assertEquals(toDoListSize, 2);
        assertEquals(inProgressListSize, 1);
        assertEquals(doneListSize, 3);
        assertEquals(toDoListContent, "Walk with dog");
        assertEquals(inProgressListContent, "Laundry");
        assertEquals(doneListContent, "Dishwasher");
    }
}
