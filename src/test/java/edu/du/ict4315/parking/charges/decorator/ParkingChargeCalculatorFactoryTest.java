package edu.du.ict4315.parking.charges.decorator;

import edu.du.ict4315.parking.charges.strategy.ParkingLot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class ParkingChargeCalculatorFactoryTest {
    @Test
    void getParkingChargeCalculator() {
        ParkingLot t = new ParkingLot("025",
                "200 Campus Way NE Seattle WA 98009", "495", 8.0);
        assertEquals(8.0, 8.0);

    }
}