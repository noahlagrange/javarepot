package com.github.noahlagrange.workshop;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[]args) {
        int lauch = 1;
        Random random = new Random();
        int nbr = random.nextInt() % 100;
        if (nbr < 0)
            nbr *= -1;
        Scanner giv_nbr = new Scanner(System.in);
        System.out.printf("%d\nYour guess? ", nbr);
        int res = giv_nbr.nextInt();
        while (res != nbr) {
            lauch += 1;
            if (res < nbr) {
                System.out.printf("To low!\n");
            }
            if (res > nbr) {
                System.out.printf("To high!\n");
            }
            System.out.printf("Your guess? ");
            res = giv_nbr.nextInt();
        }
        System.out.printf("You win!\n");
        System.out.printf("It took you %d tries", lauch);
    }
}
