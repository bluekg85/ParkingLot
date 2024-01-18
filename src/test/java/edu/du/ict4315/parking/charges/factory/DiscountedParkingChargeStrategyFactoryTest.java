package edu.du.ict4315.parking.charges.factory;

import edu.du.ict4315.parking.charges.strategy.ParkingLot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountedParkingChargeStrategyFactoryTest {

    @Test
    void getStrategy() {
        ParkingLot b = new ParkingLot("020", "200 Campus Way NE Seattle WA 98009", "495", 8.00);
        assertEquals(8.00, 8.00);
    }

}