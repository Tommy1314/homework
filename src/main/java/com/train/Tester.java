package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); /* System.in = input */
        int run1;
        do {
            System.out.print("Please enter number of tickets: ");
            run1 = scanner.nextInt();
            if (run1 != -1) {
                System.out.print("How many round-trip tickets: ");
                int run2 = scanner.nextInt();
                Ticket ticket = new Ticket(run1, run2);
                System.out.println("Total tickets: " + run1);
                System.out.println("Round-trip: " + run2);
                System.out.println("Total Cost: " + ticket.cal());
                System.out.println(" ");
            }
        }
        while (run1 != -1);
        System.out.println("Stop and Finish");
    }
}