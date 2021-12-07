package com.agrgic;

public class Main {

    public static void main(String[] args) {

        //Challenge
        System.out.println("Challenge 1:");
        byte byteChallenge = 10;
        short shortChallenge = 20;
        int intChallenge = 50;
        long longChallenge = 50_000L + 10L * (byteChallenge + shortChallenge + intChallenge);
        System.out.println(longChallenge);

        short shortTotal = (short) (1000 + 10 *
                (byteChallenge + shortChallenge + intChallenge));
        System.out.println(shortTotal);
    }
}
