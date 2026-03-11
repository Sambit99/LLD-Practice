package com.practice.lld.DesignPattern.Behavioral.StrategyPattern.WithStrategyPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
