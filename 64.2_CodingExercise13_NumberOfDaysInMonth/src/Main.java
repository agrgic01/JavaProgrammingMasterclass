public class Main {


    public static void main(String[] args) {

        System.out.println("\n *'isLeapYear' TEST*");

        System.out.println(NumberOfDaysInMonth.isLeapYear(-1600));
        System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2020));


        System.out.println("\n *'getDaysInMonth' TEST*");
        System.out.println("My Test Values:");

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2021));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2021));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(6, 2021));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(22, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 22020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, -1));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-2, -2020));

        System.out.println("Course Test Values:");
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));

    } /* 'main' METHOD */


} /* 'Main' CLASS */
