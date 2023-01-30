package com.github.noahlagrange.workshop;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 201; ++i) {
            System.out.printf("%d", i);
            if (i % 3 == 0 && i % 5 == 0)
                System.out.printf(" Fizzbuzz");
            if (i % 3 == 0 && i % 5 != 0)
                System.out.printf(" Fizz");
            if (i % 3 != 0 && i % 5 == 0)
                System.out.printf(" Buzz");
            System.out.printf("\n");
        }
    }
}