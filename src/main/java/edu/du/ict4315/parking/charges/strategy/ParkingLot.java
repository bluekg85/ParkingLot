package edu.du.ict4315.parking.charges.strategy;

import edu.du.ict4305.*;

import java.util.ArrayList;
import java.util.List;
public class ParkingLot {
    private String LotID;
    private String Name;
    private Address address;
    private String Capacity;
    private ParkingLotType lotType;
    private double DailyRate=10;
    //Constructor using parking Lot parameters defined above
    public ParkingLot(String LotID,String Name,Address address ){
        super();
        this.LotID=LotID;
        this.Name=Name;
        this.address=address;
    }
    //Get method for ParkingLot ID, it returns ParkingLot ID
    public String getLotID(){return LotID;}
    //Get method for name, it returns parking lot name
    public String getName(){return Name;}
    //Get method for Address
    public Address getAddress(){return address;}
    //Get method for lot Type
    public ParkingLotType getLotType(){ return lotType;}

    //Set method for ID
    public void setLotID(String LotID){
        this.LotID = LotID;
    }
    //Set name Method
    public void setName(String Name){
        this.Name = Name;
    }
    //Set method for Address
    public void setAddress(Address address){
        this.address = address;
    }
    //Set method for lotType
    public void setLotType(ParkingLotType lotType){
        this.lotType = lotType;
    }
    //This method will return the daily rate for each car type according to the discount rate based
    // on Car type and base rate for the parking lot
    public Money getDailyRate(CarType car){
        Money money;
        money = new Money(10.0,"$");
        money.setCurrency("$");
        double base_rate = lotType.getRate();
        double discountRate = base_rate - ((car.getDiscount()/100)*base_rate);
        money.setAmount(discountRate);
        return money;
    }
    // attribute for Notification Service
    private NotificationService notificationService;
    private List<ParkingAction> parkingActions = new ArrayList<ParkingAction>();
    NotificationService ParkingLot(){
        notificationService= new NotificationService();
        return notificationService;
    }
    // get method for Notification service
    public NotificationService getNotificationService(){
        return notificationService;
    }
    public ParkingLot(String LotID,Address address, String Capacity, double DailyRate){
        this.LotID=LotID;
        this.address=address;
        this.Capacity=Capacity;
        this.DailyRate=DailyRate;
    }
    public static void main(String[] args){
        // this will charge the daily standard rate
        StrategyContext strategyContext = new StrategyContext(new StandardRate());
        System.out.println("Standard Daily Rate is = $ " + strategyContext.executeStrategy(10,1));
        // this operation takes 20% off the regular parking rate
        strategyContext = new StrategyContext(new CompactDiscount());
        System.out.println("Compact Daily Rate is = $ " + strategyContext.executeStrategy(10,0.8));
        // this operation increases the regular rate to triple the Standard Rate
        strategyContext = new StrategyContext(new SpecialEvent());
        System.out.println("Special Event Rate is = $ " + strategyContext.executeStrategy(10,3));
        // this will print a message when a car enters or exits the parking lot
        System.out.println("Car has entered parking lot");
    }

}

