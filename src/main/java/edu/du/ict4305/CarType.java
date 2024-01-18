package edu.du.ict4305;
public enum CarType {
    Compact(20),
    SUV(0);

    private int discount;

    //This constructor will initialize the discount percentage based on car type for the parameter discount

    CarType(int discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

}