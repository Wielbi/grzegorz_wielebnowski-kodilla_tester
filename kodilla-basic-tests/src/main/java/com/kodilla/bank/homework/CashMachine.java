package com.kodilla.bank.homework;

public class CashMachine {
    private int cashAmount;
    private int transactionCount;
    private int[] transactions;
    private int transactionPosition;

    public CashMachine() {
        this.transactions = new int[10];
        this.transactionCount = 3;
        this.transactionPosition = 0;

    }
    public int getTransactionCount() {
        return transactionCount;
    }

    public int getCashAmount() {
        int sum = 0;
        for (int i = 0; i < transactions.length ; i++){
            sum += transactions[i];

        }
        return sum;
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
    public void depositTransaction(int amount){
        transactions[transactionPosition] = amount;
        transactionPosition ++;

    }
    public void withDrawTransaction(int amount){
        transactions[transactionPosition] = -amount;
        transactionPosition ++;
    }

    public int[] getTransactions() {
        return transactions;
    }
    public double depositAverage(){
        double result = 0;
        double counter = 0;
        for (int i = 0 ; i < transactions.length ; i++){
            if (transactions[i]> 0 ) {
                result += transactions[i];
                counter ++;
            }
        }
        return result /counter;

    }
    public double withdrawsAverage(){
        double result = 0;
        double counter = 0;
        for (int i = 0; i < transactions.length; i++){
            if (transactions[i]<0) {
                result+=transactions[i];
                counter++;
            }
        }
        return result/counter;
    }
//    public double average(boolean isDeposit){
//        double result = 0;
//        double counter = 0;
//
//        for (int i = 0 ; i < transactions.length ; i++){
//
//            if (transactions[i]> 0 && isDeposit) {
//                result += transactions[i];
//                counter ++;
//
//            }else if (transactions[i] < 0 && !isDeposit ){
//
//            }
//        }
//        return result /counter;
//
//    }
}

