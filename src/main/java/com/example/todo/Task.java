package com.example.todo;

public class Task {
    private int id;
    private String name;
    private boolean completed;

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
        this.completed = false;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public boolean isCompleted() { return completed; }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
