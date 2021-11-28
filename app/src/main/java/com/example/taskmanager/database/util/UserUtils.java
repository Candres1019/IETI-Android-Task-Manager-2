package com.example.taskmanager.database.util;

public final class UserUtils {

    public static final String SELECT_ALL_USERS = "SELECT * FROM user";

    public static final String SELECT_ALL_USERS_BY_ID = SELECT_ALL_USERS + " WHERE id IN (:userIds)";

    public static final String SELECT_ALL_USERS_BY_NAME = SELECT_ALL_USERS + "WHERE firstname LIKE :first AND lastname LIKE :last LIMIT 1";

}
