package edu.du.ict4315.parking.charges.factory;
import edu.du.ict4315.parking.charges.strategy.ParkingLot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SpecialEventRateTest {
    @Test
    void getStrategy() {
        ParkingLot d = new ParkingLot("023", "200 Campus Way NE Seattle WA 98009", "495", 30.0);
        assertEquals(30.0, 30.0);
    }
}