package com.cursor.hw14.task2.cloud;

import com.cursor.hw14.task2.cloud.client.Client;
import com.cursor.hw14.task2.cloud.network.Network;
import com.cursor.hw14.task2.cloud.server.TomcatServer;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.cursor.hw14.task2.cloud.network.Network.establishNetwork;
import static com.cursor.hw14.task2.util.ConsoleColor.*;

public class Cloud {

    private static final Network NETWORK = establishNetwork();
    ExecutorService singleThread = Executors.newSingleThreadExecutor();

    public void emulateCommunicationBetweenClientsAndServers() {
        System.out.println(GREEN + "Clients logs - GREEN COLOR" + RESET);
        System.out.println(MAGENTA + "Network logs - MAGENTA COLOR" + RESET);
        System.out.println(CYAN + "Tomcat servers logs - CYAN COLOR\n\n" + RESET);
        final List<Client> clients =
                Arrays.asList(new Client("192.168.56.11"), new Client("127.0.0.1"), new Client("194.212.142.215"),
                        new Client("168.192.56.11"), new Client("0.0.0.1"), new Client("142.212.194.215"),
                        new Client("11.192.56.168"), new Client("0.1.0.0"), new Client("215.212.194.142"),
                        new Client("56.192.56.11"), new Client("1.0.0.0"), new Client("194.212.142.215"));
        final List<TomcatServer> servers =
                Arrays.asList(new TomcatServer("168.212.226.204"), new TomcatServer("135.58.24.17"));
        clients.forEach(NETWORK::establishConnectionWithClient);
        servers.forEach(NETWORK::establishConnectionWithTomcatServer);
        clients.forEach(Client::sendRequestToServer);
    }

    public void sendRequestToServer() {
        singleThread.submit(this::emulateCommunicationBetweenClientsAndServers);

        singleThread.shutdown();

    }
}
