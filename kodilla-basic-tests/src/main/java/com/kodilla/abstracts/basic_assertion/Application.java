package com.kodilla.abstracts.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtract = calculator.subtract(a, b);
        boolean correct = ResultChecker.assertEquals(-3,subtract );
        if (correct) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " +  a  + " i "  + b );
        } else {
            System.out.println("Metoda subtract nie działapoprawnie dla liczb " + a + "i" + b );

        }

    }
}


