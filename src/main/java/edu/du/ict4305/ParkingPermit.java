package edu.du.ict4305;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class ParkingPermit {
    //This class maintains all Parking permit related information like vehicle, expiration date details.
    //  Using this class we can create,modify, and print parking permit information
    private String ID;
    private Car car;
    private Calendar expirationDate;
    private Calendar registrationDate;
    private String name;

    // Constructor will set parameters while creating an instance of Parking Permit
    public ParkingPermit(String ID,Car car,Calendar expirationDate, Calendar registrationDate ){
        this.ID = ID;
        this.car=car;
        this.expirationDate=expirationDate;
        this.registrationDate=registrationDate;
    }

    // This is the get method for permit ID
    public String getID() {
        return ID;
    }

    // This is the get method for Car
    public Car getCar(){
        return car;
    }

    // This is the get method for Permit Expiration date
    public Calendar getExpirationDate() {
        return expirationDate;
    }

    // This is the get method for Permit Registration Date
    public Calendar getRegistrationDate() {
        return registrationDate;
    }

    // This is the Set Method for ID
    public void setID(String ID) {
        this.ID = ID;
    }

    // This is the Set Method for Car
    public void setCar(Car car) {
        this.car = car;
    }

  // This is the set Method for Permit Expiration Date
  public void setExpirationDate(Calendar expirationDate) {
      this.expirationDate = expirationDate;
  }

    // This is the set Method for Permit Registration Date
      public void setRegistrationDate(Calendar registrationDate) {
          this.registrationDate = registrationDate;
      }

// this method will convert date to String in Month/day/Year Format
    public String getDateString(Calendar date) {
        String dateString = "";

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        dateString = sdf.format(date.getTime());

        return dateString;
    }
   // This method will validate if Permit ID valid or not and will provide a true or false response
    public boolean validateID() {

        boolean isValid = true;

        if(ID == null || ID.isEmpty()) {
            isValid = false;
        }
        return isValid;
    }
    // This Method will validate the expiration date and check if its null or empty and will provide a true, false response
    public boolean validateExpirationDate() {
        boolean result = true;
        if(expirationDate == null) {

            result = false;
        }
        return result;
    }
    // This Method will validate the registration date and check if its null or empty and will provide a true, false response
    public boolean validateRegistrationDate() {
        boolean result = true;

        if(registrationDate == null) {

            result = false;
        }

        return result;
    }


}


