package com.mycompany.bankacc;
public class BankAcc {

    public static void main(String[] args)
    {
        CheckingAccount checkingAccount = new CheckingAccount(2334, 233333);
        SavingAccount savingsAccount = new SavingAccount(123,12333);

        double checkingInterest = checkingAccount.calculateInterest();
        double savingsInterest = savingsAccount.calculateInterest();

        System.out.println("Interest for checking account: " + checkingInterest);
        System.out.println("Interest for savings account: " + savingsInterest);
    }
}
