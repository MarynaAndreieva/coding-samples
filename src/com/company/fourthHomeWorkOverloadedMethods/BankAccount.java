package com.company.fourthHomeWorkOverloadedMethods;

public class BankAccount {

    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount newBalance = new BankAccount(100);
        newBalance.accountReplenishment(100);
        newBalance.withdrawalAccount(50);
    }

    public void accountReplenishment(int increaseValue) {
        int accountReplenishment = balance + increaseValue;
        System.out.println(accountReplenishment);
    }

    public void withdrawalAccount(int decreaseValue) {
        int withdrawalAccount = balance - decreaseValue;
        System.out.println(withdrawalAccount);
    }
}
