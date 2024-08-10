package com.sgtest.Factorial;

public class Fact2 {
    public static void main(String[] args) {
        getfactorial(3);
    }

    static void getfactorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of Number:" + fact);
    }
}