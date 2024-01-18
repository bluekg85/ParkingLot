package edu.du.ict4315.parking.charges.factory;
public class DiscountedRate implements parkingChargeStrategyFactory {
   //Discounted Rate applies to compact cars and is 20% off
    double discountedRate = 8.00;

    public String getStrategy() {
        return ("Discount Strategy: $ "+ discountedRate);
    }


}

