package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BankTestSuite {

    @Test
   public void getTotalCashAmount() {
        Bank bank = new Bank();
        bank.setCashMachines(new CashMachine[]{
                new CashMachine(),
                new CashMachine()});
        int TotalCashAmount = 0;
        for (int i  = 0; i < bank.getMachineAmount(); i++){
            TotalCashAmount += bank.cashMachines[i].getCashAmount();
        }
        assertEquals(2000,TotalCashAmount);
    }
    @Test
    public void getTotalWithdrawsCount(){
        Bank bank = new Bank();
        bank.setCashMachines(new CashMachine[]{
                new CashMachine(),
                new CashMachine()});
        int TotalWithdrawsCount = 0;
        for (int i = 0 ; i < bank.cashMachines.length; i ++){
            TotalWithdrawsCount += bank.cashMachines[i].getTransactionCount();
        }
        assertEquals(6,TotalWithdrawsCount );

    }
    @Test
    void getTotalDepositsCount() {
        Bank bank = new Bank();
        CashMachine cashMachine = new CashMachine();
        cashMachine.depositTransaction(100);
        cashMachine.withDrawTransaction(50);
        cashMachine.withDrawTransaction(20);

        System.out.println(Arrays.toString(cashMachine.getTransactions()));
      bank.setCashMachines(new CashMachine[]{
             cashMachine});
      int TotalDepositsCount = 0;
      for (int i = 0 ; i < bank.cashMachines.length; i ++){
          TotalDepositsCount += bank.cashMachines[i].getDepositCount();

              }
       assertEquals(1,TotalDepositsCount );
    }
}