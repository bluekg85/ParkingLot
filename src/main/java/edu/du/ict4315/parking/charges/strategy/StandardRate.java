package edu.du.ict4315.parking.charges.strategy;
public class StandardRate implements ParkingPriceStrategy {
    public double doOperation(double num1, double num2){
        return (int) (num1 * num2);
    }
}
