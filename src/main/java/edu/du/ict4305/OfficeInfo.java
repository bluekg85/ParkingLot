package edu.du.ict4305;
public interface OfficeInfo {
    public Customer register(String firstName, String lastName, String address1,String address2, String city, String state, String zip, String Phone);
    public Customer getCustomerByName(String firstName, String lastName);
    public Customer getCustomerByPhone(String phone);

}
