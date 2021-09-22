package com.company;

public class BankAccount {
    private double balance;
    private float interestRate;

    public BankAccount(){
        interestRate = 0.02f;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public boolean withdraw(double amount){
        if(balance < amount)
            return false;
        balance -= amount;
        return true;
    }
    public double checkBalance(){
       return balance;
    }
    public double addInterest(){
        balance += balance *interestRate;
        return balance;
    }
    public void printBalance(){
        System.out.println(balance);
    }
}
