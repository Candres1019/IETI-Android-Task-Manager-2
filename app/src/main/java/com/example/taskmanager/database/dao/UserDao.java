package com.example.taskmanager.database.dao;

import static com.example.taskmanager.database.util.UserUtils.SELECT_ALL_USERS;
import static com.example.taskmanager.database.util.UserUtils.SELECT_ALL_USERS_BY_ID;
import static com.example.taskmanager.database.util.UserUtils.SELECT_ALL_USERS_BY_NAME;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.taskmanager.database.model.User;

import java.util.List;

@Dao
public interface UserDao {

    @Insert
    void insertAll(List<User> users);

    @Delete
    void delete(User user);

    @Query(SELECT_ALL_USERS)
    List<User> getAll();

    @Query(SELECT_ALL_USERS_BY_ID)
    List<User> loadAllByIds(int[] userIds);

    @Query(SELECT_ALL_USERS_BY_NAME)
    User findByName(String first, String last);
}