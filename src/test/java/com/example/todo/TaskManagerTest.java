package com.example.todo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class TaskManagerTest {
    private TaskManager taskManager;

    @BeforeEach
    public void setUp() {
        taskManager = new TaskManager();
    }

    @Test
    public void testAddTask() {
        Task task = new Task(1, "Sample Task");
        taskManager.addTask(task);
        assertEquals(1, taskManager.getAllTasks().size(), "Task should be added to the manager.");
    }

    @Test
    public void testRemoveTask() {
        Task task = new Task(1, "Sample Task");
        taskManager.addTask(task);
        assertTrue(taskManager.removeTask(1), "Task should be removed successfully.");
        assertEquals(0, taskManager.getAllTasks().size(), "Task list should be empty after removal.");
    }

    @Test
    public void testGetTaskById() {
        Task task = new Task(1, "Sample Task");
        taskManager.addTask(task);
        Task retrievedTask = taskManager.getTaskById(1);
        assertNotNull(retrievedTask, "Task should be found by ID.");
        assertEquals("Sample Task", retrievedTask.getName(), "Task name should match the expected value.");
    }

    @Test
    public void testGetAllTasks() {
        Task task1 = new Task(1, "Sample Task 1");
        Task task2 = new Task(2, "Sample Task 2");
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        List<Task> tasks = taskManager.getAllTasks();
        assertEquals(2, tasks.size(), "There should be 2 tasks in the manager.");
    }
}
