package com.kodilla.abstracts.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sqrt = calculator.sqrt(a);
        boolean correct = ResultChecker.assertEquals(25,sqrt );
        if (correct) {
            System.out.println("Metoda sqrt nie działapoprawnie dla liczb " + a);

        } else {
            System.out.println("Metoda sqrt działa poprawnie dla liczb " +  a );
        }

    }
}


