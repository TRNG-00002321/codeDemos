package com.revature.bank;

public class BankManager {
    public static void main(String[] args) {

      //  BankAccount bankAccount=new BankAccount("B001","Jasdhir",10000);

        SavingAccount savingAccount=new SavingAccount("S001","Stephenie",20000);
        System.out.println(savingAccount);
        savingAccount.withdraw(500);
        System.out.println(savingAccount);


        CheckingAccount checkingAccount=new CheckingAccount("C002","Jeremiah",25000);


    }
}
