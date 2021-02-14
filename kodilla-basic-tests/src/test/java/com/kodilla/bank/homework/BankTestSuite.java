package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class BankTestSuite {

    @Test
    void getTotalCashAmount() {
        Bank bank = new Bank();
        bank.setCashMachines(new CashMachine[]{
                new CashMachine(),
                new CashMachine()});
    }

    @Test
    void getTotalWithdrawsCount(){
        Bank bank = new Bank();
       int wynik= bank.getTotalDepositsCount();
       assertEquals(200,wynik );

    }
    @Test
    void getTotalDepositsCount() {
        Bank bank = new Bank();
       int wynik =  bank.getTotalDepositsCount();
       assertEquals(12, wynik);
    }
}