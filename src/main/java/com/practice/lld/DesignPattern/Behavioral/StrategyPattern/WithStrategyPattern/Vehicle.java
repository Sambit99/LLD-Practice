package com.practice.lld.DesignPattern.Behavioral.StrategyPattern.WithStrategyPattern;

import com.practice.lld.DesignPattern.Behavioral.StrategyPattern.WithStrategyPattern.strategy.DriveStrategy;

public class Vehicle {
    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
