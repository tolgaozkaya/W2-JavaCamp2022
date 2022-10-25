package core.concretes;

import core.abstracts.LoggerManager;

public class FileLogger extends LoggerManager {
    @Override
    public void log(String data) {
        System.out.println("Dosyaya loglandi : " + data);
    }
}
