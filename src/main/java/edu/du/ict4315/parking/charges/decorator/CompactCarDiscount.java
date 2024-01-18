package edu.du.ict4315.parking.charges.decorator;
import edu.du.ict4305.CarType;
import edu.du.ict4305.ParkingEvent;

public class CompactCarDiscount extends ParkingChargeDecorator{
    private Double discountRate = 0.2;
    public CompactCarDiscount(ParkingChargeCalculator calc){
        super(calc);
    }
    @Override
    public Double getDiscount(ParkingEvent parkingEvent){
        if(isCompactCar(parkingEvent.getPermit().getCar().getType())){
            System.out.println("Compact car discount rate applied");
            return super.getDiscount(parkingEvent)+discountRate;
        }
        System.out.println("Vehicle type discount cannot be applied to this vehicle");
        return super.getDiscount(parkingEvent);
    }
    private boolean isCompactCar(CarType carType){
        return carType == CarType.Compact;
    }

}
