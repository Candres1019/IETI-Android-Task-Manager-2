package com.example.taskmanager.database.util;

public final class TaskUtils {

    public static final String SELECT_ALL_TASKS = "SELECT * FROM task";

    public static final String SELECT_ALL_TASKS_BY_ID = SELECT_ALL_TASKS + "WHERE id IN (:taskIds)";

    public static final String SELECT_ALL_TASKS_BY_NAME = SELECT_ALL_TASKS + "WHERE name LIKE :task LIMIT 1";

}
