package com.practice.lld.DesignPattern.Behavioral.ChainOfResponsibilityPattern;

public class WarningLogProcessor extends LogProcessor{
    public WarningLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == WARNING){
            System.out.println("WARNING: " + message);
        }else {
            super.log(logLevel, message);
        }
    }
}
