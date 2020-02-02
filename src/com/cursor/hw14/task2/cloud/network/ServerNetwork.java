package com.cursor.hw14.task2.cloud.network;


import com.cursor.hw14.task2.cloud.data.HttpResponse;

public interface ServerNetwork {

    void sendResponseToClient(final HttpResponse response);
}
