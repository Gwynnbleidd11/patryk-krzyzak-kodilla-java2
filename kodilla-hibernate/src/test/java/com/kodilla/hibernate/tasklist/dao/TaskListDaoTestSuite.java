package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("List No 1", "List with primary tasks");
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When

        List<TaskList> listOfTaskLists = taskListDao.findByListName(listName);

        //Then
        assertEquals(1, listOfTaskLists.size());

        //CleanUp
//        int id = taskList.getId();
//        taskListDao.deleteById(id);
    }
}
