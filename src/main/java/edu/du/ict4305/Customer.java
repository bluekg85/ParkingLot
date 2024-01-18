package edu.du.ict4305;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
    private String customerID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address address;

    // this constructor will set the parameters listed above while creating new customer instances
    public Customer(String customerID, String firstName, String lastName, Address address, String PhoneNumber) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    // this is the getter method for Customer ID
    public String getCustomerID() {
        return customerID;
    }

    // this is the setter method for Customer ID
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    // this is the getter method for firstName
    public String getFirstName() {
        return firstName;
    }

    // this is the setter method for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // this is the setter method for Last Name
    public String getLastName() {
        return lastName;
    }

    // this is the setter method for Last Name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //this is the geetter method for Address
    public Address getAddress() {
        return address;
    }

    //this is the setter method for Address
    public void setAddress(Address address) {
        this.address = address;
    }

    //this method is the getter for Phone Number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    //this method is the setter for Phone Number
    public void setPhoneNumber(String PhoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //This method returns customer information in label and comma separated form

    public String getCustomerInfo() {
        String customerInfo = null;

        customerInfo = "ID:" + customerID + "Name:" + getCustomerName() + "PhoneNumber:" + getPhoneNumber() + "Address:" + address.getAddressInfo();
        return customerInfo;
    }

    //this method will concatenate first and name name and will add a space in between to return the full Customer Name
    public String getCustomerName() {
        String name = null;
        name = firstName + " " + lastName;
        return name;
    }

    /**
     * This method will validate if first name is empty and will return a null or empty message.
     * if that is not the case the sytem will return true of false
     */
    public boolean validatefirstName() {
        boolean isValid = true;
        if (firstName.isEmpty() | firstName == null) {
            isValid = false;
        }
        return isValid;
    }

    /**
     * This method will validate whether the field phone number is null or empty.
     * the system will provide a true or false statement if phone number is null or empty
     * this method will also validate that phone numbers are entered with the assigned format and will provide
     * a true or false response if the format is accurate
     */
    public boolean validatePhoneNumber() {
        String phoneNumberRegx = "\\(?[0-9]{3}\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern validPhoneNumberPattern = Pattern.compile(phoneNumberRegx);
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return false;
        }
        Matcher isPhoneNumberValid = validPhoneNumberPattern.matcher(phoneNumber);
        if (!isPhoneNumberValid.matches()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Customer [id=" + customerID + "firstName=" + firstName + "+lastName=" + lastName + "phoneNumber=" + phoneNumber + "address=" + address + "]";
    }
}

