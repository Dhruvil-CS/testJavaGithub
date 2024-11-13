package com.example.todo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    private Task task;

    @BeforeEach
    public void setUp() {
        task = new Task(1, "Sample Task");
        System.out.println("Hi2");
    }

    @Test
    public void testGetId() {
        assertEquals(1, task.getId(), "The task ID should match the provided ID.");
    }

    @Test
    public void testGetName() {
        assertEquals("Sample Task", task.getName(), "The task name should match the provided name.");
    }

    @Test
    public void testIsCompletedDefault() {
        assertFalse(task.isCompleted(), "The task should initially be incomplete.");
    }

    @Test
    public void testSetCompleted() {
        task.setCompleted(true);
        assertTrue(task.isCompleted(), "The task should be marked as completed.");
    }
}
