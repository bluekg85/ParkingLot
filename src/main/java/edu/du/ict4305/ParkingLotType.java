package edu.du.ict4305;

public enum ParkingLotType {

    TypeS(10.0),
    TypeC(8.0),
    TypeE(30.0);

    private double rate;
    //This construction will initialize the daily base rate for parking lot type
    ParkingLotType(double rate){
        this.rate = rate;
    }
    //This method will return the daily base rate based on each parking lot type
    public double getRate(){
        return rate;
    }

}
