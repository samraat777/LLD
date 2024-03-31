package com.sam.java.LoggingFramework_ChainOfFResponsibility;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }


    @Override
    public void log(int logLevel, String message) {
        if(logLevel == 2)
        {
            System.out.println(LogLevel.DEBUG +": "+ message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
