package edu.du.ict4315.parking.charges.decorator;
public class ParkingChargeCalculatorFactory {
    public ParkingChargeCalculator getParkingChargeCalculator(String strategy){

        if("CompactDiscount".equalsIgnoreCase(strategy)){
            System.out.println("Compact Discount Calculator created");
            return new CompactCarDiscount(new BaseParkingChargeCalculator());
        } else if ("CarTypeDiscount".equalsIgnoreCase(strategy)){

        } else if("CompactCarTypeDiscount".equalsIgnoreCase(strategy)){
            System.out.println("WeekdayDiscount and CarTypeDiscount created");
            return new CompactCarDiscount(new CompactCarDiscount(new BaseParkingChargeCalculator()));
        } else if (strategy == null){
            System.out.println("Base Calculator Created");
            return new BaseParkingChargeCalculator();
        }
        return null;
    }
}
