package com.cursor.hw14.task2.cloud.network;


import com.cursor.hw14.task2.cloud.data.HttpRequest;

public interface ClientNetwork {

    void sendRequestToServer(final HttpRequest request);
}
