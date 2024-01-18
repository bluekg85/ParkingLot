package edu.du.ict4305;

public class RegisterCustomer implements Command{

    private Office commandrc;
    public RegisterCustomer(Office commandrc){this.commandrc = commandrc
    ;}
    public void execute (){commandrc.registercustomer();

    }
}
