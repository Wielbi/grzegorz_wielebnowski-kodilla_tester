package com.kodilla.abstracts.basic_assertion;

public class Calculator {


    public int sum(int a, int b) {
        return (a + b);

    }

    public int subtract(int a, int b) {
        return (a - b);

    }

    public int sqrt(int b) {
        if (b < 0){
            return 0;
        }
            return (int) Math.sqrt(b);
    }


}
