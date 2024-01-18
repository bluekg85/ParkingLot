package edu.du.ict4315.parking.charges.strategy;
public class SpecialEvent implements ParkingPriceStrategy {

    public double doOperation(double num1, double num2){
        return num1 * num2;
    }

}
