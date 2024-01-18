package edu.du.ict4305;

import java.util.ArrayList;
public class Money {
    private double amount;
    private String currency;

    /** This constructor has two parameters. This will set Money parameters while creating the instance
     * @param amount
     * @param currency
     */
    public Money(Double amount, String currency) {
        super();
        this.amount = amount;
        this.currency = currency;
    }
    // getter method for amount
    public Double getAmount(){return amount;}

    // getter method for currency

    // setter method for amount
    public Double setAmount(Double amount){return amount;
    }
    //Set currency method
    public String setCurrency(String currency){return currency;}

    // validate if amount is positive or not
    public boolean validateAmount(){
        boolean result = true;
        if(amount <= 0){
            result = false;
        }
        return result;
    }
    public boolean validateCurrency() {
        boolean result = true;
        ArrayList<String> validCurrency = new ArrayList<String>();
        validCurrency.add("USD");
        validCurrency.add("$");
        boolean add = validCurrency.add("DOLLAR");

        if(currency == null){
            result = false;
        } else if (!validCurrency.contains(currency)){
        return false;
    }
        return result;
    }
    @Override
    public String toString(){
        return "Money [amount" + amount + ",currency="+currency + "]";
    }
}



