public class MinutesToYearsDaysCalculator {


    public static final int MINUTES_IN_YEAR = 525_600;
    public static final int MINUTES_IN_DAY = 1440;

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0)
            System.out.println("Invalid Value");
        else {
            long years = minutes / MINUTES_IN_YEAR;
            long days = (minutes % MINUTES_IN_YEAR) / MINUTES_IN_DAY;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        } /* 'else' STATEMENT */

    } /* 'printYearsAndDays' METHOD */


} /* 'MinutesToYearsDaysCalculator' CLASS */
