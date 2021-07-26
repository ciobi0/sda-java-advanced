package com.sdaJavaAdvanced.interfaces.exercise2;

import java.time.Instant;

public class ClientX implements ClientNotifier{
    @Override
    public void notifyClient(Instant currentDateTime) {
        System.out.println("ClientX received from server date/time: "+currentDateTime);
    }
}
