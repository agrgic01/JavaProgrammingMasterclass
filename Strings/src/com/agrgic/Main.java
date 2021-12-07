package com.agrgic;

public class Main {

    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        //basic string
        System.out.println("\n *Basic String*");
        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);

        //appending strings
        System.out.println("\n *Appending Strings*");
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to: " + myString);

        myString = myString + " \u00A92019";
        System.out.println("myString is equal to: " + myString);

        //number string example
        System.out.println("\n *Number String Example*");
        String numberString = "250.55";
        numberString += "49.95";
        System.out.println(numberString);

        //appending string+int
        System.out.println("\n *Appending an 'Int' Data Type Variable to a String*");
        String lastString = "10";
        int myInt = 50;
        lastString += myInt; //the integer gets converted to a string here, gets treated as a string
        System.out.println("Last string is equal to " + lastString);

        //appending a double data type to the last example
        System.out.println("\n Appending a 'Double' Data Type to a String");
        double doubleNumber = 120.47d;
        lastString += doubleNumber;
        System.out.println("Last string is equal to " + lastString);


    }
}
