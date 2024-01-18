package edu.du.ict4305;
public class ParkingService {
    public static void main(String[] args) {
        Office abcOffice = new Office();

            RegisterCustomer registerCustomerCommand = new RegisterCustomer(abcOffice);
            RegisterCar registerCarCommand = new RegisterCar(abcOffice);

            POffice pOffice = new POffice();
            pOffice.takeCommand(registerCustomerCommand);
            pOffice.takeCommand(registerCarCommand);

            pOffice.placeCommands();

    }
}













