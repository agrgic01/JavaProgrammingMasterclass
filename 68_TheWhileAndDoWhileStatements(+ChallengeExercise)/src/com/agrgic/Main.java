package com.agrgic;

public class Main {


    public static void main(String[] args) {

        // while loop example
        int count = 1;
        while (count != 6) {
            System.out.println("Correct value is " + count);
            count++;
        } // while

        // for loop equivalent to while loop above
        for (count = 1; count < 6; count++) {
            System.out.println("Count value is " + count);
        } // while

        // while loop, another example
        count = 1;
        while (true) {
            if (count == 6)
                break;
            System.out.println("While loop value " + count);
            count++;
        } // while

        // do while loop example
        count = 6;
        do {
            System.out.println("count value was " + count);
            count++;

            if (count > 100)
                break;
        } while (count != 6);

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
