package com.agrgic;

public class Main {


    public static void main(String[] args) {

        // Challenge part of the video
//        System.out.println(isEvenNumber(1));
//        System.out.println(isEvenNumber(2));
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {

            if (evenNumbersFound == 5) {
                System.out.println("Number of even numbers: " + evenNumbersFound);
                break;
            } // if

            if (isEvenNumber(number)) {
                System.out.println("Even number: " + number);
                evenNumbersFound++;
            } // if
            number++;
        } // while

    } /* 'main' METHOD */


    public static boolean isEvenNumber(int number) {

        return number % 2 == 0;

    } /* 'isEvenNumber' METHOD */


} /* 'Main' CLASS */
