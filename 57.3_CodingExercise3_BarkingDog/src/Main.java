public class Main {


    public static void main(String[] args) {

        boolean borkTestOne = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(borkTestOne);

        boolean borkTestTwo = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(borkTestTwo);

        boolean borkTestThree = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(borkTestThree);

        boolean borkTestFour = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(borkTestFour);

    } // main method


} // Main class
