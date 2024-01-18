package edu.du.ict4315.parking.charges.factory;

public class SpecialEventRate implements parkingChargeStrategyFactory {
    double specialEvent=30.0;// Special Event Rate is 3 times the regular Rate
    public String getStrategy() {
        return ("SpecialEvent: $ "+ specialEvent);
    }
}