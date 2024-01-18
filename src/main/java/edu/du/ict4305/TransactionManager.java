package edu.du.ict4305;

import edu.du.ict4315.parking.charges.factory.parkingChargeStrategyFactory;

import java.util.ArrayList;
import java.util.HashMap;

public class TransactionManager {
    public String charges;
    private parkingChargeStrategyFactory factory;
    private ParkingTransaction transaction;
    private ArrayList<ParkingTransaction> transactions = new ArrayList<>();
    private HashMap<String, ArrayList<ParkingTransaction>> carTransaction = new HashMap<>();

    public ArrayList<ParkingTransaction> getTransactions() {
        return transactions;
    }

}










