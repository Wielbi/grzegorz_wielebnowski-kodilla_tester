package com.kodilla.bank.homework;

public class CashMachine {
    private int cashAmount;
    private int transactionCount;
    private int[] transactions;

    public CashMachine() {
        this.transactions = new int[10];
        this.transactionCount = 0;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public int getWithdrawsCount() {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if (transactions[i] < 0) result++;
        }
        return result;
    }

    public int getDepositCount() {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if (transactions[i] > 0) result++;
        }
        return result;
    }
}
