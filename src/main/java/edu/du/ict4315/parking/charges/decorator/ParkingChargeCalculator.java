package edu.du.ict4315.parking.charges.decorator;
import edu.du.ict4305.ParkingEvent;
// Created by Karen Garcia
public interface ParkingChargeCalculator {
    public Double getDiscount(ParkingEvent parkingEvent);
}
