package com.sdaJavaAdvanced.interfaces.exercise2;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private List<ClientNotifier> notifierList = new ArrayList<>();

    public Server(List<ClientNotifier> notifierList ){
        this.notifierList = notifierList;
    }

    public void notifyClients(){
        for (ClientNotifier client : notifierList){
            client.notifyClient(Instant.now());
        }
    }
}
