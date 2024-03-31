package com.sam.java.LoggingFramework_ChainOfFResponsibility;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, java.lang.String message) {
        if(logLevel == 1)
        {
            System.out.println(LogLevel.INFO +": "+ message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
