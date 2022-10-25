package core.concretes;

import core.abstracts.LoggerManager;

public class EmailLogger extends LoggerManager {
    @Override
    public void log(String data) {
        System.out.println("Email loglandi : "+ data);
    }
}
