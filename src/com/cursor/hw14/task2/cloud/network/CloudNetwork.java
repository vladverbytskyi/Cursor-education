package com.cursor.hw14.task2.cloud.network;

import com.cursor.hw14.task2.cloud.client.Client;
import com.cursor.hw14.task2.cloud.server.TomcatServer;

public interface CloudNetwork {

    void establishConnectionWithTomcatServer(final TomcatServer server);

    void establishConnectionWithClient(final Client client);
}
