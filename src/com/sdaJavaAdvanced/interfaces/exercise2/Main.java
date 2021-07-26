package com.sdaJavaAdvanced.interfaces.exercise2;
//Suppose you have written a time server that periodically notifies its clients of the current date and time.
// Write an interface the server could use to enforce a particular protocol on its clients.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClientNotifier clientX1 = new ClientX();
        ClientNotifier clientX2 = new ClientX();
        ClientNotifier clientX3 = new ClientX();
        List<ClientNotifier> clients = new ArrayList<>();
        clients.add(clientX1);
        clients.add(clientX2);
        clients.add(clientX3);
        Server server = new Server(clients);
        server.notifyClients();
    }


}
