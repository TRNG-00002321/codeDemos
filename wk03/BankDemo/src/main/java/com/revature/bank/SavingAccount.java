package com.revature.bank;

public class SavingAccount extends BankAccount implements SimpleInterest {

    public SavingAccount() {
    }

    public SavingAccount(String accountId, String accountName, double balance) {
        super(accountId, accountName, balance);
    }

    @Override
    public String toString() {
        return "SavingAccount{} " + super.toString();
    }

    @Override
    public double deposit(double amount) {
        return super.deposit(amount);
    }

    @Override
    public double withdraw(int amount) {
        double balance=super.getBalance();
        balance-=amount;
        super.setBalance(balance);
        return balance;
    }


    @Override
    public double calculateInterest(double percentage) {
        return 0;
    }
}
