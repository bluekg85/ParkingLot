package edu.du.ict4305;
import edu.du.ict4315.parking.charges.strategy.ParkingLot;
import java.time.Instant;

public class ParkingEvent {
    private ParkingLot parkingLot;
    private Instant timeIn;
    private Instant timeOut;
    private ParkingPermit permit;
    private Instant day;

    public ParkingEvent(ParkingLot parkingLot, ParkingPermit permit,Instant TimeIn){
        this.parkingLot = parkingLot;
        this.permit = permit;
        timeIn = TimeIn;
        this.timeOut=null;
    }
    public ParkingEvent(ParkingLot parkingLot, ParkingPermit permit, Instant TimeIn,Instant timeOut){
        this.parkingLot=parkingLot;
        this.permit=permit;
        this.timeIn=null;
        this.timeOut=timeOut;
    }
    public ParkingLot getParkingLot(){
        return parkingLot;
    }
    public Instant getTimeIn(){return timeIn;}
    public ParkingPermit getPermit(){
        return permit;
    }
    public Instant getTimeOut(){return timeOut;}


    }

