package edu.du.ict4305;
public class Car {
    private String licensePlate;
    private CarType type;
    private Customer owner;

    public Car(String licensePlate, CarType type, Customer owner) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.owner = owner;
    }

    public CarType getType() {
        return type;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public Customer getOwner() {
        return owner;
    }
    // Setter Method for car type
    public void setType(CarType type) {
        this.type = type;
    }
    // Setter Method for License Plate
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    // Setter Method for Owner
    public void setOwner(Customer owner) {
        this.owner = owner;
    }
    // the following method validates if type is null or empty.It returns a true or false value as shown below
    public boolean validateLicensePlate() {
        boolean isValid = true;

        if (licensePlate == null || licensePlate.isEmpty()) {
            isValid = false;
        }
        return isValid;
    }
    // This method validates if owner value is null or empty. It returns a true or false value as shown below
    public boolean validateOwner() {
        boolean isValid = true;

        if (owner == null) {
            isValid = false;
        }
        return isValid;
    }
    public static void main(String[] args) {
        edu.du.ict4305.CarType myVar = edu.du.ict4305.CarType.SUV;
        System.out.println(myVar);
    }
}


