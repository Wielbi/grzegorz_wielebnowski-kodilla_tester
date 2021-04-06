package com.kodilla.bank.homework;

public class CashMachine {
    private int cashAmount;
    private int transactionCount;
    private int[] transactions;
    private int transactionPosition;

    public CashMachine() {
        this.transactions = new int[10];
        this.transactionCount = 3;
        this.cashAmount = 1000;
        this.transactionPosition = 0;

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
    public void depositTransaction(){
        transactions[transactionPosition] = 1;
        transactionPosition ++;

    }
    public void withDrawTransaction(){
        transactions[transactionPosition] = -1;
        transactionPosition ++;

    }
}
