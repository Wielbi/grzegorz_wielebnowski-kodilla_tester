package com.kodilla.abstracts.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sqrt = calculator.sqrt(b);
        boolean correct = ResultChecker.assertEquals( 64, sqrt );
        if (correct) {
            System.out.println("Metoda sqrt  działapoprawnie dla liczb " +b);

        } else {
            System.out.println("Metoda sqrt nie działa poprawnie dla liczb " +  b);
        }

    }
}


