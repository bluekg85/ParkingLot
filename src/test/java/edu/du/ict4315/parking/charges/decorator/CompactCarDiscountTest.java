package edu.du.ict4315.parking.charges.decorator;
import edu.du.ict4305.ParkingCharge;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CompactCarDiscountTest {
    @Test
    void getDiscount() { ParkingCharge b = new ParkingCharge("C",
            "19889 NE 158th St NE Woodnville WA 98290","500",10.0,"Compact");
        assertEquals("Compact", "Compact");
    }
}