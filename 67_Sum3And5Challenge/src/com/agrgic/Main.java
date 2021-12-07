package com.agrgic;

public class Main {


    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("valid number: " + i);
                //System.out.println("/count:/ " + count);
                //System.out.println("/sum:/ " + sum);
                if (count == 5)
                    break;
            } // if
        } // for

        System.out.println("Final Sum: " + sum);

    } /* 'main' METHOD */


} /* 'Main' CLASS */
