package com.agrgic;

public class Main {

    //CONSTANTS
    private static final String INVALID_VALUE_MESSAGE = "Invalid Day";


    public static void main(String[] args) {

        System.out.println("\n *Day of the Week Challenge*");
        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
        printDayOfTheWeekIfElse(2);

        System.out.println("\n *Day of the Week Bonus Challenge*");
        printDayOfTheWeekIfElse(-1);
        printDayOfTheWeekIfElse(2);



    } /* 'main' METHOD */


    private static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println(INVALID_VALUE_MESSAGE);
                break;
        }

    } /* 'printDayOfTheWeek' METHOD */


    private static void printDayOfTheWeekIfElse(int day) {

        if (day == 0)
            System.out.println("Sunday");
        else if (day == 1)
            System.out.println("Monday");
        else if (day == 2)
            System.out.println("Tuesday");
        else if (day == 3)
            System.out.println("Wednesday");
        else if (day == 4)
            System.out.println("Thursday");
        else if (day == 5)
            System.out.println("Friday");
        else if (day == 6)
            System.out.println("Saturday");
        else
            System.out.println(INVALID_VALUE_MESSAGE);

    } /* 'printDayOfTheWeekIfElse' METHOD */


} /* 'Main' CLASS */
