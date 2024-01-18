package edu.du.ict4315.parking.charges.decorator;
import edu.du.ict4305.ParkingEvent;
public class BaseParkingChargeCalculator implements ParkingChargeCalculator{
    @Override
    public Double getDiscount(ParkingEvent parkingEvent){
        return 0.0;
    }
}
