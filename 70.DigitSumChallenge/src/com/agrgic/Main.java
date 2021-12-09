package com.agrgic;

public class Main {


    public static void main(String[] args) {

        System.out.println("sum of digits in number 125 is " + sumDigits(125));
        System.out.println("sum of digits in number -125 is " + sumDigits(-125));
        System.out.println("sum of digits in number 4 is " + sumDigits(4));
        System.out.println("sum of digits in number 32123 is " + sumDigits(32123));

    } /* 'main' METHOD */


    private static int sumDigits(int number) {

        if (number < 10)
            return -1;

        int sum = 0;

        while (number > 0) {
           int extractDigit = number % 10;
           sum += extractDigit;
           number /= 10;
        } // while

        return sum;

    } /* 'sumDigits' METHOD */


} /* 'Main' CLASS */
