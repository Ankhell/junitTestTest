package me.ankhell.utils;

import java.util.concurrent.atomic.AtomicInteger;

public class Logger {

    private static Logger logger;

    private Logger() {
    }

    public static Logger getLogger(){
        if (logger==null){
            logger = new Logger();
            return logger;
        } else {
            return logger;
        }
    }

    AtomicInteger executingCounter = new AtomicInteger(0);

    public void logStart(int varId) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
        System.out.printf(
                "%s | Start | %s | %s | variation %s | curently executing %d test%n",
                addSpaces(Thread.currentThread().getName(),24),
                stackTraceElement.getClassName().replaceAll(".*\\.(.*)$", "$1"), stackTraceElement.getMethodName(),
                varId,
                executingCounter.incrementAndGet());
    }

    public void logEnd(int varId) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
        System.out.printf(
                "%s | Stop  | %s | %s | variation %s | curently executing %d test%n",
                addSpaces(Thread.currentThread().getName(),24),
                stackTraceElement.getClassName().replaceAll(".*\\.(.*)$", "$1"), stackTraceElement.getMethodName(),
                varId,
                executingCounter.decrementAndGet());
    }

    private String addSpaces(String input,int length){
        StringBuilder stringBuilder = new StringBuilder(input);
        while (stringBuilder.length()<length){
            stringBuilder.append(' ');
        }
        return stringBuilder.toString();
    }
}
