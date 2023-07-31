package com.mycompany.bankacc;
abstract class BankAccount 
{
    private int accountNumber;
    private int balance;
    
    public void setaccountNumber(int accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public void setbalance(int balance)
    {
        this.balance=balance;
    }
    
    public int getaccountNumber()
    {
        return accountNumber;
    }
    public int getbalance()
    {
        return balance;
    }
    
    public abstract double calculateInterest();
}
