package com.example.taskmanager.network.storage;

/**
 * Storage signature
 *
 * @author Andres Calderon
 */
public interface Storage {

    void saveToken(String token);

    String getToken();

}
