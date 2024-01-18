package edu.du.ict4305;
import edu.du.ict4315.parking.charges.strategy.ParkingLot;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingOffice implements OfficeInfo {
    private String parkingOfficeName;//parking lot name
    private Address parkingOfficeAddress; // parking office address
    private List<Car> cars;// cars list
    private HashMap<String,ParkingLot> parkingLots;// parking lots list
    private TransactionManager transactionManager;
    private PermitManager permitManager;
    private HashMap<String, Customer> customers;
    private Map<String, Customer> customerToIDMap; // maps customer to ID
    private Map<String, Customer> customerToPhoneMap; //maps customer to phone number on record
    private Map<String, ParkingLot> customerLotIDMap; //maps customer to Lot ID
    private Map<Customer, String> permitToCustomerMap; // maps customer to their Permit ID
    
    //Default Constructor, this will be used to create instances of the class and initialize customers and parking lot attributes
    public ParkingOffice(){
        customers = new HashMap<String, Customer>();
        parkingLots = new HashMap<String, ParkingLot>();
    }
    
    // Constructor with parameters. This constructor will set the parameters inside the parenthesis while creating an instance
    public ParkingOffice( String parkingOfficeName,Address parkingOfficeAddress,HashMap<String, Customer> customers,
                          HashMap<String, ParkingLot> parkingLots)
            {
        this.parkingOfficeName = parkingOfficeName;
        this.parkingOfficeAddress = parkingOfficeAddress;
        this.customers = customers;
        this.parkingLots = parkingLots;

        customerToIDMap = new HashMap<>();
        customerToPhoneMap = new HashMap<>();
        permitToCustomerMap = new HashMap<>();

      // initialize transaction and permit managers
        this.transactionManager = new TransactionManager();
        this.permitManager = new PermitManager();
    }
    
    // This is the get method for Parking Office Name
    public String getParkingOfficeName() {
        return parkingOfficeName;
    }
    // This is the get method for customers
    public HashMap<String, Customer> getCustomers(){
        return customers;
    }
    // This is the get method for parking lots
    public HashMap<String, ParkingLot> getParkingLots(){
        return parkingLots;
    }
    // This is the get method for address
    public Address getParkingOfficeAddress(){
        return parkingOfficeAddress;
    }
    // This is the set method for name
    public void setParkingOfficeName(String parkingOfficeName){
        this.parkingOfficeName = parkingOfficeName;
    }
    //set method for Parking Office Address
    public void setParkingOfficeAddress(Address parkingOfficeAddress){
        this.parkingOfficeAddress=parkingOfficeAddress;
    }

    // This method will register new customers to Parking Office
    public void register(Customer customer){
        customers.put(customer.getCustomerID(),customer);
    }
    // This method will remove customers from Parking Office
    public Customer removeCustomer(Customer customer){
        Customer removeCustomer = customers.remove(customer.getCustomerID());
        return removeCustomer;
    }
    // get customer Information from Customer map
    public Customer getCustomer(String CustomerID){
        Customer customer = customers.get(CustomerID);
        return customer;
    }
    //This method will add new parking lot to Parking Office
    public void addLot(ParkingLot parkingLot){
        parkingLots.put(parkingLot.getLotID(),parkingLot);
    }
    //This method will remove a parking lot from Parking Office
    public ParkingLot removeLot(ParkingLot parkingLot){
        ParkingLot removedLot = parkingLots.remove(parkingLot.getLotID());
        return removedLot;
    }
    //This method will get a parking lot object for the given lot ID
    public ParkingLot getParkingLot(String parkingLotID){
        return parkingLots.get(parkingLotID);
    }
    // This method will validate if ParkingOfficeName is null or empty and will return a true of false response.
    public boolean validateParkingOfficeName(){
        boolean result = true;
        if(parkingOfficeName == null ||parkingOfficeName.isEmpty()){
            result=false;
        }
        return result;
    }
    @Override
    public String toString(){
        return"Parking Office[parkingOfficeName="+ parkingOfficeName+",customers="+ customers +", parkingLots="+ parkingLots +",parkingOfficeAddress="+
                parkingOfficeAddress+"]";
    }
    @Override
    public Customer register(String firstName, String lastName, String address1, String address2, String city, String state, String zip, String Phone) {
        return null;
    }

    /**
     * @param firstName
     * @param lastName
     * @return
     */
    @Override
    public Customer getCustomerByName(String firstName, String lastName) {
        return null;
    }

    /**
     * @param phone
     * @return
     */
    @Override
    public Customer getCustomerByPhone(java.lang.String phone) {
        return null;
    }
    private List<ParkingTransaction> charges; // parking charges list

    /**
     * @param firstName;
     * @param lastName;
     * @param address1;
     * @param address2;
     * @param city;
     * @param state;
     * @param zip;
     * @param Phone;
     * @return
     */
}
