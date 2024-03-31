package com.sam.java.LoggingFramework_ChainOfFResponsibility;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor nextLogProcessor)
    {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == 3)
        {
            System.out.println(LogLevel.ERROR +": "+ message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
