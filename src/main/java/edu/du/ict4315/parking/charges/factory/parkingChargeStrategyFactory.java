package edu.du.ict4315.parking.charges.factory;

public interface parkingChargeStrategyFactory {
    public default String getStrategy() {
        return null;
    }

}
