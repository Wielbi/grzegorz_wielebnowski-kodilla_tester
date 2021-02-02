package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public void setCashMachines(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public Bank() {
        this.cashMachines = new CashMachine[10];
    }

    public int getTotalCashAmount() {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += cashMachines[i].getCashAmount();
        }
        return result;
    }

    public int getTotalWithdrawsCount() {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += cashMachines[i].getWithdrawsCount();

        }
        return result;
    }
    public int getTotalDepositsCount() {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += cashMachines[i].getDepositCount();
        }
        return result;
    }
}
