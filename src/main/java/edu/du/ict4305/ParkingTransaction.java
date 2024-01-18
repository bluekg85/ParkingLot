package edu.du.ict4305;
import edu.du.ict4315.parking.charges.strategy.ParkingLot;

import java.time.Instant;
import java.util.Calendar;
public class ParkingTransaction{
    // This class manages parking transactions. It stores the permit and which lot the vehicle is using
    // private Calendar transactionDate;
    private Calendar transactionDate;
    private ParkingPermit permit;
    private ParkingLot parkingLot;
    private Money feeCharged;
    private Instant incurred;
    public static class Builder {
        // parameters required
        private Calendar transactionDate;
        private ParkingPermit permit;
        private ParkingLot parkingLot;
        private Money feeCharged;

        //optional or variable parameters
        public Builder(Calendar transactionDate,ParkingPermit permit, ParkingLot parkingLot, Money feeCharged) {
            this.transactionDate = transactionDate;
            this.permit = permit;
            this.parkingLot = parkingLot;
            this.feeCharged = feeCharged;
        }
    }
    //Get method for transactionDate
    public Calendar getTransactionDate(){
        return getTransactionDate();
    }
    //Get method for parking permit
    public ParkingPermit getPermit(){
        return permit;
    }
    //Get method for Parking Lot
    public ParkingLot getParkingLot(){
        return parkingLot;
    }
    //Set method for transaction date
    public void setTransactionDate(Calendar transactionDate){
        this.transactionDate = transactionDate;
    }
    //Set method for parking permit
    public void setPermit(ParkingPermit permit){
        this.permit = permit;
    }
    //Set method for parking lot
    public void setParkingLot(ParkingLot parkingLot){
        this.parkingLot = parkingLot;
    }
    //This method will return the parking fee based on the parking lot and parking permit details
    public Money getChargedAmount(){
        feeCharged = parkingLot.getDailyRate(permit.getCar().getType());
        return feeCharged;
    }

    }



