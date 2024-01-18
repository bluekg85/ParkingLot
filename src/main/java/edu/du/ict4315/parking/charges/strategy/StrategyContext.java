package edu.du.ict4315.parking.charges.strategy;
public class StrategyContext {
    private ParkingPriceStrategy strategy;
    public StrategyContext(ParkingPriceStrategy parkingPriceStrategy){
        this.strategy = parkingPriceStrategy;
    }
    public double executeStrategy (double num1, double num2){
        return strategy.doOperation(num1, num2);
    }
}

