package com.agrgic;

public class Main {


    public static void main(String[] args) {

        // Challenge part 1, write a for loop
        System.out.println(" *Challenge part 1, write a for loop*");

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        } /* 'for' LOOP */

        // Challenge part 2, modify for loop to print backwards
        System.out.println(" *Challenge part 2, modify for loop to print backwards*");

        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        } /* 'for' LOOP */

        // Challenge part 3, generate prime number
        System.out.println(" *Challenge part 3, generate prime number*");
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                } /* if #2 */
            } /* if #1 */
        } /* for */

    } /* 'main' METHOD */

    public static boolean isPrime(int n) {

        if (n == 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            } /* 'if' STATEMENT */
        } /* 'for' LOOP */

        return true;

    } /* 'isPrime' METHOD */

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));

    } /* 'calculateInterest' METHOD */


} /* 'Main' CLASS */
