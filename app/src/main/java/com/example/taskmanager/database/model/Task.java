package com.example.taskmanager.database.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * Represents a Task
 */
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Task {

    @PrimaryKey(autoGenerate = true)
    public String id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "user")
    public String assignedUser;

}
