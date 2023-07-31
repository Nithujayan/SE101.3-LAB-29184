package com.mycompany.bankacc;
class SavingAccount extends BankAccount
{
    public c(int accountNumber, int balance )
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
