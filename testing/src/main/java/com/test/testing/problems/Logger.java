package com.test.testing.problems;

public class Logger implements Cloneable{
    private static Logger logger;

    private Logger() {

    }

    public static synchronized Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public void log(String message) {
        System.out.println(message);
    }

    @Override
    public Logger clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
    }
}