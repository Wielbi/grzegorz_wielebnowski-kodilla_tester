package com.kodilla.abstracts.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
       // int a = 5;
       // int b = 8;
       // int sqrt = calculator.sqrt(b);
        //boolean correct = ResultChecker.assertEquals(64, sqrt);
       // if (correct) {
            //System.out.println("Metoda sqrt  działa poprawnie dla liczb " + b);

        //} else {
           // System.out.println("Metoda sqrt nie działa poprawnie dla liczb " + b);

        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
//
        }
    }
}



