// Coding Exercise: Positive, Negative or Zero
// Write a method called 'checkNumber' with an int parameter 'number'.
// The method should not return any value, and it needs to print out:
//      a) "positive" if the parameter number is >0
//      b) "negative" if the parameter number is <0
//      c) "zero" if the parameter number is equal to 0
// NOTE: The 'checkNumber' method needs to be defined as public static like we have been doing so far in the course.
// NOTE: Do not add a main method to your solution code!

package com.agrgic;

public class Main {

    public static void main(String[] args) {
        // MY WAY
        checkNumber(-1);
    } // 'main' method

    public static void checkNumber(int number) {
        // MY WAY
        if (number == 0)
            System.out.println("Zero");
        else if (number > 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    } // 'checkNumber' method

} // 'Main' class
