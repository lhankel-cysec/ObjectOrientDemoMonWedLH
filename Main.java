package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var myAccount = new BankAccount();
        myAccount.deposit(1000);
        myAccount.addInterest();
        var didSucceed = myAccount.withdraw(2000);
        if(didSucceed)
            System.out.println("Successfully made withdrawl");
        else
            System.out.println("Could not make with draw, current balance is "+ myAccount.checkBalance());

    }
}
