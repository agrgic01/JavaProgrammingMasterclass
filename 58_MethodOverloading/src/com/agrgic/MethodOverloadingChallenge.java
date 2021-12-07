package com.agrgic;

public class MethodOverloadingChallenge {


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double centimeters = (feet * 12 + inches) * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }

        System.out.println("Invalid Value");
        return -1;

    } /* calcFeetAndInchesToCentimeters */


    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (!(inches >= 0))
            return -1;

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches equals to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);

    } /* calcFeetAndInchesToCentimeters */


} /* MethodOverloadingChallenge class */
