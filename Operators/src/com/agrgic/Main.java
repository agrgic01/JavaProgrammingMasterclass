package com.agrgic;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

        // plus operator
        int result = 1 + 2;      // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // assigning the value of the 'result' variable to another variable
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        // the minus operator
        result -= 1;            // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        // the multiplication operator
        result *= 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        // the division operator
        result /= 5;            // 20 / 5
        System.out.println("20 / 5 = " + result);

        // the modular AKA remainder operator
        result %= 3;            // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // the ++ operator
        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        // the -- operator
        // result = result - 1;
        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //if-then statement
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens.");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        // and operator
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // or operator
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        // 38. Assignment Operator VS Equals to Operator
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        // 39. Ternary Operator
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // 40. Operator Precedence and Operator Challenge
        System.out.println("\n *Operator Challenge*");
        double firstNumber = 20.00d;
        double secondNumber = 80.00d;
        double sumNumber = (firstNumber + secondNumber) * 100;
        System.out.println(sumNumber);
        sumNumber %= 40.00;
        System.out.println(sumNumber);

        boolean checkSum = (sumNumber == 0) ? true : false;
        System.out.println(checkSum);

        if (!checkSum)
            System.out.println("Got some remainder");
        else
            System.out.println("No remainder");





















    }
}
