package com.practice.lld.DesignPattern.Behavioral.StrategyPattern.WithStrategyPattern.strategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sports Drive Capability");
    }
}
