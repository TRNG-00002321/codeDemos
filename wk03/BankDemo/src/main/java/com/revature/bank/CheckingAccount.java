package com.revature.bank;

public class CheckingAccount extends BankAccount{

    public CheckingAccount() {
    }

    public CheckingAccount(String accountId, String accountName, double balance) {
        super(accountId, accountName, balance);
    }

    @Override
    public String toString() {
        return "CheckingAccount{} " + super.toString();
    }

    @Override
    public double withdraw(int amount) {
        return 0;
    }
}
