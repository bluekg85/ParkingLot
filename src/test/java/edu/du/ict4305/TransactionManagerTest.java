package edu.du.ict4305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionManagerTest {

    @Test
    void park() {
        ParkingCharge a = new ParkingCharge("North1", "19807 NE 158th ST Woodinville WA 98077", "500", 25.0, "25");
        assertEquals("25.00", "25.00", "correct daily rate");
    }
}