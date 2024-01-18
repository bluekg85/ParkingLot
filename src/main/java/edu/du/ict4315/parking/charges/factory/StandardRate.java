package edu.du.ict4315.parking.charges.factory;
public class StandardRate implements parkingChargeStrategyFactory {
double standardRate=10;// Standard Rate is a flat amount, $10 for example
    public String getStrategy() {
        return ("StandardRate: $ "+standardRate);
    }
}
