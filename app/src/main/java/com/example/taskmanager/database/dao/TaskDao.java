package com.example.taskmanager.database.dao;

import static com.example.taskmanager.database.util.TaskUtils.SELECT_ALL_TASKS;
import static com.example.taskmanager.database.util.TaskUtils.SELECT_ALL_TASKS_BY_ID;
import static com.example.taskmanager.database.util.TaskUtils.SELECT_ALL_TASKS_BY_NAME;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.taskmanager.database.model.Task;

import java.util.List;


public interface TaskDao {

    @Insert
    void insertAll(List<Task> tasks);

    @Delete
    void delete(Task task);

    @Query(SELECT_ALL_TASKS)
    List<Task> getAll();

    @Query(SELECT_ALL_TASKS_BY_ID)
    List<Task> loadAllByIds(int[] taskIds);

    @Query(SELECT_ALL_TASKS_BY_NAME)
    Task findByName(String task);

}
