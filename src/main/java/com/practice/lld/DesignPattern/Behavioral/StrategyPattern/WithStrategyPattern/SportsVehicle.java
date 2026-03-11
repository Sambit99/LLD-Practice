package com.practice.lld.DesignPattern.Behavioral.StrategyPattern.WithStrategyPattern;

import com.practice.lld.DesignPattern.Behavioral.StrategyPattern.WithStrategyPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
