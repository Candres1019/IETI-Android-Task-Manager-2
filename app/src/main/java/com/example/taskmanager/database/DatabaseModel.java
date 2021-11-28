package com.example.taskmanager.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.taskmanager.database.dao.TaskDao;
import com.example.taskmanager.database.dao.UserDao;
import com.example.taskmanager.database.model.Task;
import com.example.taskmanager.database.model.User;

/**
 * Database model
 */
@Database(entities = {User.class, Task.class}, version = 1)
public abstract class DatabaseModel extends RoomDatabase {

    public abstract UserDao userDao();

    public abstract TaskDao taskDao();

}
