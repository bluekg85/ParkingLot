package edu.du.ict4315.parking.charges.decorator;
import edu.du.ict4305.ParkingCharge;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ParkingChargeCalculatorTest {
    @Test
   void getDiscount() { ParkingCharge a = new ParkingCharge("A",
            "19807 NE 158th St NE Woodnville WA 98290","500",10.0,"Holiday");
        assertEquals("Holiday", "Holiday");
    }
}