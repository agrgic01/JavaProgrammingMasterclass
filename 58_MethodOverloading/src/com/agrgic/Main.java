package com.agrgic;

public class Main {


    public static void main(String[] args) {

        // first calculateScore method, 2 parameters
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);

        // second calculateScore method, overloaded, one parameter
        calculateScore(75);

        // third calculateScore method
        calculateScore();

        // Method Overloading Challenge
        System.out.println("\n Method Overloading Challenge");
        double centimeters = MethodOverloadingChallenge.calcFeetAndInchesToCentimeters(5, 7);
        /*if (centimeters < 0.0)
            System.out.println("Invalid Parameters");*/
        MethodOverloadingChallenge.calcFeetAndInchesToCentimeters(160);
    } /* main method */


    public static int calculateScore(String playerName, int score) {

        System.out.println("Player: " + playerName + " scored " + score + " points");
        return score * 1000;

    } /* 1st calculateScore method */


    public static int calculateScore(int score) {

        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;

    } /* 2nd calculateScore method */


    public static int calculateScore() {

        System.out.println("No player name, no player score");
        return 0;

    } /* 3rd calculateScore method */


} /* Main Class */
