package com.cursor.hw14.task2.cloud.client;

import com.cursor.hw14.task2.cloud.data.HttpRequest;
import com.cursor.hw14.task2.cloud.data.HttpResponse;
import com.cursor.hw14.task2.cloud.network.ClientNetwork;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import static com.cursor.hw14.task2.cloud.network.Network.establishNetwork;
import static com.cursor.hw14.task2.util.ConsoleColor.GREEN;
import static com.cursor.hw14.task2.util.ConsoleColor.RESET;

public class Client {

    private static final ClientNetwork NETWORK = establishNetwork();

    private final String ipAddress;

    public Client(final String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void sendRequestToServer() {
        executeRequestSendingInSeparateThread();
    }

    private void executeRequestSendingInSeparateThread() {
        new Thread(this::executeRequestSending).start();
    }

    private void executeRequestSending() {
        try {
            long start = System.currentTimeMillis();
            Thread.sleep(ThreadLocalRandom.current().nextLong(3000, 30000));
            long end = System.currentTimeMillis();
            System.out.println(GREEN + String.format(
                    "sending request so SERVER {clientIp: %s}, time in seconds to prepare request by client: %s",
                    ipAddress, TimeUnit.MILLISECONDS.toSeconds(end - start)) + RESET);
            NETWORK.sendRequestToServer(new HttpRequest(ipAddress));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void acceptServerResponse(final HttpResponse response) {
        if (!response.getClientIpAddress().equals(ipAddress)) {
            throw new IllegalStateException("could not accept response from server for wrong client");
        }
        System.out.println(GREEN + String.format("accepted response from SERVER {serverIp: %s, clientIp: %s}" + RESET,
                response.getServerIpAddress(), response.getClientIpAddress()));
    }


    public String getIpAddress() {
        return ipAddress;
    }
}
