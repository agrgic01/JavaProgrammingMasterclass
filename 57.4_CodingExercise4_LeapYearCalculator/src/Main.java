public class Main {


    public static void main(String[] args) {
        System.out.println("*Not Leap Years, should return false*");
        System.out.println(LeapYear.isLeapYear(1700));
        System.out.println(LeapYear.isLeapYear(1800));
        System.out.println(LeapYear.isLeapYear(1900));
        System.out.println(LeapYear.isLeapYear(2100));
        System.out.println(LeapYear.isLeapYear(2200));
        System.out.println(LeapYear.isLeapYear(2300));
        System.out.println(LeapYear.isLeapYear(2500));
        System.out.println(LeapYear.isLeapYear(2600));
        System.out.println(LeapYear.isLeapYear(2017));


        System.out.println("\n*Leap Years, should return true*");
        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(LeapYear.isLeapYear(2000));
        System.out.println(LeapYear.isLeapYear(2400));

    } // main method


} // Main class
