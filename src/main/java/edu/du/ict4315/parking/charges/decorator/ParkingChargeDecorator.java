package edu.du.ict4315.parking.charges.decorator;
import edu.du.ict4305.ParkingEvent;
public abstract class ParkingChargeDecorator implements ParkingChargeCalculator{
    private final ParkingChargeCalculator calc;
    public ParkingChargeDecorator(ParkingChargeCalculator calc){
        this.calc=calc;
    }
    @Override
    public Double getDiscount(ParkingEvent parkingEvent){
        return calc.getDiscount(parkingEvent);
    }
}
