package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        System.out.println("[" + ft.format(dNow) + " " + num++ + "] " + msg);
    }
}
