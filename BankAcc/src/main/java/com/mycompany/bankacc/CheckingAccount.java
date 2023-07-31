package com.mycompany.bankacc;
class CheckingAccount extends BankAccount
{    
    public CheckingAccount(int accountNumber, int balance)
    {
        super(accountNumber,balance);
    }
   @Override
   public double calculateInterest()
   {
       double IntrestRate = 0.12;
       return getbalance() * IntrestRate;
   }
}
