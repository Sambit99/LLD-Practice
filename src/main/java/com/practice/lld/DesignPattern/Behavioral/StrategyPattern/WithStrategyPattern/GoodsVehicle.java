package com.practice.lld.DesignPattern.Behavioral.StrategyPattern.WithStrategyPattern;


import com.practice.lld.DesignPattern.Behavioral.StrategyPattern.WithStrategyPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
