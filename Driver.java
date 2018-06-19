package com.heckercode.controller;
import com.heckercode.utilities.*;


public class Driver {

    public static void main(String[] args) {
        CheckingAccount c;
        c = new CheckingAccount(101);
        System.out.println("Depositing Rs 5000");
        c.deposit(5000);
        try {
            System.out.println("Withdrawing Rs. 1000");
            c.withdraw(1000);
            System.out.println("Withdrawing Rs. 5000");
            c.withdraw(5000);

        } catch(com.heckercode.UserDefineException.InsufficientFundException e) {
            System.out.println("Sorry Insufficient Balance, You are short of " + e.getAmount());

        }
    }
}




