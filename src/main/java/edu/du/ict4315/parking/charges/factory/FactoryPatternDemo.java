package edu.du.ict4315.parking.charges.factory;
public class FactoryPatternDemo {
    public static void main(String[] args){
        //Discounted Rate
        parkingChargeStrategyFactory discountrate = RateFactory.getStrategy(.08);
        System.out.println(discountrate.getStrategy());
        //Standard Rate
        parkingChargeStrategyFactory standardrate = RateFactory.getStrategy(1);
        System.out.println(standardrate.getStrategy());
        //Special Event Rate
        parkingChargeStrategyFactory specialeventrate = RateFactory.getStrategy(3);
        System.out.println(specialeventrate.getStrategy());
    }

}
