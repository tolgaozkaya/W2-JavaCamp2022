package core.concretes;

import core.abstracts.LoggerManager;

public class DatabaseLogger extends LoggerManager {
    @Override
    public void log(String data) {
        System.out.println("Database loglandi : " + data);
    }
}
