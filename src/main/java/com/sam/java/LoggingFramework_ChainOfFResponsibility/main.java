package com.sam.java.LoggingFramework_ChainOfFResponsibility;

public class main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR,"exception occured");
        logProcessor.log(logProcessor.DEBUG,"need to debug this");
        logProcessor.log(logProcessor.INFO,"just for info");
    }
}
