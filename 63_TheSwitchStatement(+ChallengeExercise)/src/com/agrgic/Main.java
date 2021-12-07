package com.agrgic;

import java.util.Locale;

public class Main {


    public static void main(String[] args) {

        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        // CODE CHALLENGE
        System.out.println("\n *SWITCH Code Challenge*");
        char charValue = 'G';

        switch (charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println(charValue + " was found");
                break;
            default:
                System.out.println("Could not find A, B, C, D or E ");
                break;
        }

        String month = "JANUARY";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("june");
                break;
            default:
                System.out.println("Not sure");
                break;
        }



    } /* 'main' METHOD */


} /* 'Main' CLASS */
