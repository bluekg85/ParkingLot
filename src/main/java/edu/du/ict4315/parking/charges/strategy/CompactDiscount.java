package edu.du.ict4315.parking.charges.strategy;
public class CompactDiscount implements ParkingPriceStrategy {
    @Override
    public double doOperation(double num1, double num2) {
        return (int) (num1 * num2);
    }
}
