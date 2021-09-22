package com.company;

public class BankAccount {
    private double balance;
    private float interestRate;

    public void deposit(double amount){
        balance = balance + amount;
    }
    public boolean withdraw(double amount){
        if(balance < amount)
            return false;
        balance -= amount;
        return true;
    }
}
