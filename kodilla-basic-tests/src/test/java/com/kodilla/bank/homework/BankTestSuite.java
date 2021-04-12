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
        CashMachine cashMachine = new CashMachine();
        cashMachine.depositTransaction(100);
        cashMachine.withDrawTransaction(50);
        cashMachine.withDrawTransaction(20);
        bank.setCashMachines(new CashMachine[]{
                cashMachine});
        int TotalCashAmount = bank.getTotalCashAmount();
        assertEquals(30,TotalCashAmount);
    }
    @Test
    public void getTotalWithdrawsCount(){
        Bank bank = new Bank();
        CashMachine cashMachine = new CashMachine();
        cashMachine.depositTransaction(100);
        cashMachine.withDrawTransaction(10);
        bank.setCashMachines(new CashMachine[]{
                cashMachine});
        int TotalWithdrawsCount = bank.getTotalWithdrawsCount();
        assertEquals(1,TotalWithdrawsCount );

    }
    @Test
    void getTotalDepositsCount() {
        Bank bank = new Bank();
        CashMachine cashMachine = new CashMachine();
        System.out.println(Arrays.toString(cashMachine.getTransactions()));
        cashMachine.depositTransaction(100);
        System.out.println(Arrays.toString(cashMachine.getTransactions()));
        cashMachine.withDrawTransaction(50);
        System.out.println(Arrays.toString(cashMachine.getTransactions()));
        cashMachine.withDrawTransaction(20);
        System.out.println(Arrays.toString(cashMachine.getTransactions()));

      bank.setCashMachines(new CashMachine[]{
             cashMachine});
      int TotalDepositsCount = bank.getTotalDepositsCount();
       assertEquals(1,TotalDepositsCount );
    }

    @Test
    public void testDepositAverage(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.depositTransaction(100);
        cashMachine.depositTransaction(50);

        cashMachine.withDrawTransaction(300);
        cashMachine.withDrawTransaction(100);

        double result = cashMachine.depositAverage();

        assertEquals(75,result);

    }
    @Test
    public void testWithdrawsAverage(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.withDrawTransaction(50);
        cashMachine.withDrawTransaction(100);

        cashMachine.depositTransaction(100);
        cashMachine.depositTransaction(100);
        double result = cashMachine.withdrawsAverage();
        assertEquals(-75,result);

    }
}