package edu.du.ict4305;
import java.util.Calendar;
import java.util.HashMap;
import java.util.UUID;
public class PermitManager {
    private HashMap<String,ParkingPermit>permits = null;
    // This constructor will create instances without creating attributes
    public PermitManager(){
       permits = new HashMap<String, ParkingPermit>();
    }

    // This is a constructor with parameters also known as an argument
    public PermitManager(HashMap<String, ParkingPermit>permits){

        this.permits = permits;
    }

    // This is the Get Method for Permits
    public HashMap<String, ParkingPermit> getPermits(){
        return permits;
    }

    //This is the get method for looking up a permit ID based on the customer´s License Plate
    public ParkingPermit getPermit(String licensePlate){
        return permits.get(licensePlate);
    }

    //This is the set Method for parking permits
    public void setPermits(HashMap<String, ParkingPermit>permits){
        this.permits = permits;
    }

    // This method will create an object for the Parking Permit Class and will add it to the Parking Permit list
    // The method assumes expiration date is 1 year from purchase date

    public ParkingPermit register(Car car) {

        ParkingPermit permit = new ParkingPermit("ID1234", new Car("BYS2020",CarType.SUV,
                new Customer("ID1234", "Karen","Garcia",
                        new Address("19807 NE","158th ST","Woodinville","WA", "98077"),
                        "4257884353")),,2022);
        permit.setID(UUID.randomUUID().toString());
        permit.setCar(car);

        Calendar expirationDate = Calendar.getInstance();
        expirationDate.add(Calendar.YEAR, 1);

        permit.setExpirationDate(expirationDate);
        permit.setRegistrationDate(Calendar.getInstance());

        permits.put(car.getLicensePlate(), permit);

        return permit;

    }


}


