package com.practice.lld.DesignPattern.Behavioral.ChainOfResponsibilityPattern;

public class InfoLogProcessor extends LogProcessor {
    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logInfo, String message){
        if(logInfo==INFO){
            System.out.println("INFO: " + message);
        }else{
            super.log(logInfo, message);
        }
    }
}
