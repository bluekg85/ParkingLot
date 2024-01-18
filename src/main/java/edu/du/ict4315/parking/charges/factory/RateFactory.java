package edu.du.ict4315.parking.charges.factory;

public class RateFactory {
    // uses method getRate to pull correct Rate Strategy
    public static parkingChargeStrategyFactory getStrategy(double rateType) {
        parkingChargeStrategyFactory parkingChargeStrategyFactory = null;
        //throw exception
        if (rateType == .08) {
            parkingChargeStrategyFactory = new DiscountedRate();
        } else if (rateType == 1) {
            parkingChargeStrategyFactory = new StandardRate();
        } else if (rateType == 3) {
            parkingChargeStrategyFactory = new SpecialEventRate();
        }
           return parkingChargeStrategyFactory;

    }
}
