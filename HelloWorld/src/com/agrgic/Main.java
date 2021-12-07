package com.agrgic;

import java.text.Format;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.html.HTMLAreaElement;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

        /*int count = 7;

        if(count % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");

         */

        //PRIMITIVE TYPES
        //byte myAge = 30; //Whole number
        //long veiwsCount = 3_123_456_789L; //Whole number
        //float price = 10.99F; // Decimal
        //char letter = 'A'; // Single letter
        //boolean isEligible = false; // boolean value

        /*-----------------------------------------------------------------------------------*/

        //REFERENCE TYPES
        //Date now = new Date();
        //System.out.println(now); //sout+tab

        /*-----------------------------------------------------------------------------------*/

        //PRIMITIVE TYPES VS REFERENCE TYPES
        //Primitive
        //byte x = 1;
        //byte y = 1;
        //x = 2;
        //System.out.println(y);
        //Reference
        //Point point1 = new Point(1, 1);
        //Point point2 = point1;
        //point1.x = 2;
        //System.out.println(point2);

        /*-----------------------------------------------------------------------------------*/

        //STRINGS
        //String message = "   Hello World" + "!!   ";
        //System.out.println(message.trim());
        //System.out.println(message);

        /*-----------------------------------------------------------------------------------*/

        //ESCAPE SEQUENCES
        //String message1 = "Hello \"Alen\"";
        //String message2 = "c:\\windows\\...";
        //String message3 = "Hello\nAlen";
        //String message4 = "Hello\tAlen";

        //System.out.println(message1);
        //System.out.println(message2);
        //System.out.println(message3);
        //System.out.println(message4);

        /*-----------------------------------------------------------------------------------*/

        //ARRAYS
        //int[] numbers = new int[5];
        //numbers[0] = 1;
        //numbers[1] = 2;
        //System.out.println(Arrays.toString(numbers));

        //int[] numbers1 = {2, 3, 5, 1, 4};
        //System.out.println(numbers1.length);
        //Arrays.sort(numbers1);
        //System.out.println(Arrays.toString(numbers1));

        /*-----------------------------------------------------------------------------------*/

        //MULTI DIMENSIONAL ARRAYS
        //int[][] numbers2 = new int[2][3];
        //numbers2[0][0] = 1;
        //numbers2[0][1] = 2;
        //numbers2[0][2] = 3;
        //numbers2[1][0] = 4;
        //numbers2[1][1] = 5;
        //numbers2[1][2] = 6;
        //System.out.println(Arrays.deepToString(numbers2));

        //int[][] numbers3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //System.out.println(Arrays.deepToString(numbers3));

        /*-----------------------------------------------------------------------------------*/

        //CONSTANTS
        //final float pi = 3.14F;

        /*-----------------------------------------------------------------------------------*/

        //ARITHMETIC EXPRESSIONS
        //double result = (double)10 / (double)3;
        //int x = 1;
        //int y = ++x;
        //x = x + 2;
        //x += 2;
        //System.out.println(x);
        //System.out.println(y);

        /*-----------------------------------------------------------------------------------*/

        //ORDER OF OPERATIONS
        //int x = (10 + 3) * 2;
        //System.out.println(x);

        /*-----------------------------------------------------------------------------------*/

        //CASTING
        // Implicit Casting AKA Automatic Conversion
        // byte > short > int > long > float > double
        //short x = 1;
        //int y = x + 2;
        //System.out.println(y);
        //double x = 1.1;
        //double y = x + 2; //2.0
        //System.out.println(y);

        //Explicit casting
        //Only works with compatible data types, in this case numbers
        //double x = 1.1;
        //int y = (int)x + 2;
        //System.out.println(y);

        //Converting string to integer
        //String x = "1.1";
        //int y = Integer.parseInt(x) + 2;
        //double y = Double.parseDouble(x) + 4;
        //System.out.println(y);

        /*-----------------------------------------------------------------------------------*/

        //THE MATH CLASS
        //round, ciel, floor, min, max, random
        //int result = (int) (Math.random() * 100);
        //System.out.println(result);

        /*-----------------------------------------------------------------------------------*/

        //FORMATING NUMBERS
        //Renaming Variables =right click variable name > Refactor > Rename (SHIFT + F6)
        //.getCurrencyInstance(), .getPercentInstance()
        //String result = NumberFormat.getPercentInstance().format(0.1);
        //System.out.println(result);

        /*-----------------------------------------------------------------------------------*/

        //READING INPUT
        //nextByte, next, nextLine

        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Age: ");
        //byte age = scanner.nextByte();
        //System.out.println("You are " + age);

        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Name: ");
        //String name = scanner.next();
        //System.out.println("You are " + name);

        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Name: ");
        //String name = scanner.nextLine().trim();
        //System.out.println("You are " + name);

        /*-----------------------------------------------------------------------------------*/

        //PROJECT: MORTGAGE CALCULATOR

        //principal: 100000
        //Annual Interest rate: 3.92
        //Period (Years): 30
        //Result-Mortgage=$472.81

        //MY WAY
        //Prompt asking for a Principal Amount
        /*Scanner principalQuest = new Scanner(System.in);
        System.out.print("Principal: ");
        String principalAmount = principalQuest.nextLine();

        //Prompt asking for Annual Interest Rate
        Scanner airQuest = new Scanner(System.in);
        System.out.print("Annual Interest rate: ");
        String airAmount = airQuest.nextLine();

        //Prompt asking for Period in years
        Scanner periodQuest = new Scanner(System.in);
        System.out.print("Period (Years): ");
        String periodAmount = periodQuest.nextLine();

        //Convert Annual Interest Rate into Monthly Interest Rate
        double mirAmount = (Double.parseDouble(airAmount) / 100) / 12;
        //System.out.println(mirAmount);

        //Number of Payments in months
        int nopAmount = Integer.parseInt(periodAmount) * 12;
        //System.out.println(nopAmount);

        double komba = 1 + mirAmount;
        double kombaDone = Math.pow(komba, nopAmount);
        //System.out.println(kombaDone);

        double equationTop = mirAmount * kombaDone;
        double equationBot = kombaDone - 1;
        double equationDone = equationTop / equationBot;

        double mortgageAmount = Double.parseDouble(principalAmount) * equationDone;
        //System.out.println(mortgageAmount);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(mortgageAmount);
        System.out.println(result);
*/
        //SHORTCUTS
        //mortgageAmount =  M
        //principalAmount = P //imam
        //mirAmount =       r //imam
        //nopAmount =       n //imam
        //komba = zagrada
        //kombaDone = zagrada^n
        //Math.pow(3, 5)

        //TEACHERS WAY
        /*final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageFormatted);*/

        /*-----------------------------------------------------------------------------------*/

        //COMPARISON OPERATORS
        //equals ==, inequal !=, greater than >, greater or equal >=, less than <, less or equal <=
        /*int x = 1;
        int y = 1;
        System.out.println(x == y);*/

        /*int x = 1;
        int y = 1;
        System.out.println(x <= y);*/

        /*-----------------------------------------------------------------------------------*/

        //LOGICAL OPERATORS
        //and - &&, or - ||, not !
        /*int temperature = 12;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);*/

        /*boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord ;*/

        /*-----------------------------------------------------------------------------------*/

        //IF STATEMENTS
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Temp: ");
        int temp = scanner.nextInt();

        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        else if (temp > 20)
            System.out.println("It's a nice day");
        else
            System.out.println("It's cold");*/

        /*-----------------------------------------------------------------------------------*/

        //SIMPLIFYING IF STATEMENTS
        /*int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);*/

        /*-----------------------------------------------------------------------------------*/

        //THE TERNARY OPERATOR
        /*int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);*/

        /*-----------------------------------------------------------------------------------*/

        //SWITCH STATEMENTS
        /*String role = "admin";

        switch(role) {
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }*/

        /*-----------------------------------------------------------------------------------*/

        //EXERCISE: FIZZBUZZ
        //add scanner "Number: " if a number is divisible by 5 print fizz, if number is divisible
        //by 3 print buzz, if it's divisible by both print fizzbuzz, otherwise print number.

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        //Teacher way
        if ((number % 5 == 0) && (number % 3 == 0))
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);*/

        //My way
        /*if ((number % 5 == 0) && (number % 3 != 0))
            System.out.println("Fizz");
        else if (number % 3 == 0 && (number % 5 != 0))
            System.out.println("Buzz");
        else if ((number % 5 == 0) && (number % 3 == 0))
            System.out.println("FizzBuzz");
        else
            System.out.println(number);*/

        /*-----------------------------------------------------------------------------------*/

        //FOR LOOPS
        /*for (int i = 5; i > 0;  i--)
        System.out.println("Hello World " + i);*/

        /*-----------------------------------------------------------------------------------*/

        //WHILE LOOPS
        /*int i = 5;
        while (i > 0) {
            System.out.println("Hello World " + i);
            i--;*/

        /*Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }*/

        /*-----------------------------------------------------------------------------------*/

        //DO..WHILE LOOPS
        /*do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));*/

        /*-----------------------------------------------------------------------------------*/

        //BREAK AND CONTINUE
        /*Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }*/

        /*-----------------------------------------------------------------------------------*/

        //FOR-EACH LOOPS
        /*String[] fruits = { "Apple", "Mango", "Orange" };
        //FOR LOOP
        for (int i = 0; i < fruits.length; i++)
             System.out.println(fruits[i]);

        //FOR EACH LOOP
        for (String fruit : fruits)
             System.out.println(fruit);*/

        /*-----------------------------------------------------------------------------------*/

        //PROJECT: MORTGAGE CALCULATOR v2.0
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageFormatted);
    }
}
