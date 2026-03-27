package com.practice.lld.DesignPattern.Behavioral.ChainOfResponsibilityPattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new WarningLogProcessor(new ErrorLogProcessor(null))));

        logObject.log(logObject.INFO, "InfoLogProcessor");
        logObject.log(logObject.WARNING, "WarningLogProcessor");
        logObject.log(logObject.ERROR, "ErrorLogProcessor");
        logObject.log(logObject.DEBUG, "DebugLogProcessor");
    }
}
