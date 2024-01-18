package edu.du.ict4305;
import edu.du.ict4315.parking.charges.strategy.ParkingLot;
public class ParkingCharge extends ParkingLot {
    public String Discount;
    public String Amount;

    public ParkingCharge(String LotID, String Address, String Capacity, double DailyRate, String Discount) {
        super(LotID, Address, Capacity, DailyRate);
        this.Discount = Discount;
        this.Amount = Amount;

    }


}


