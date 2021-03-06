package com.heckercode.utilities;

import UserDefineException.InsufficientFundException;

public class CheckingAccount {

    private double balance;
    private int number;

    public CheckingAccount(int number){
        this.number=number;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }
    public void withdraw(double amount) throws InsufficientFundException {
        if(amount <= balance){
            balance-=amount;
        } else{
            double needs = amount-balance;
            throw new InsufficientFundException(needs);
        }
    }

    public double getBalance(){
        return balance;
    }
    public int getNumber(){
        return number;
    }
}

