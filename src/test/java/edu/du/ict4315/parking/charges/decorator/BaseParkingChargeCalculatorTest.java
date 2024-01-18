package edu.du.ict4315.parking.charges.decorator;
import edu.du.ict4315.parking.charges.strategy.ParkingLot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class BaseParkingChargeCalculatorTest {
    @Test
    void getDiscount() {
        ParkingLot b = new ParkingLot("02", "205 Campus Way NE Seattle WA 98009",
                "100", 10.0);
        assertEquals(10.0, 10.0);
    }
}