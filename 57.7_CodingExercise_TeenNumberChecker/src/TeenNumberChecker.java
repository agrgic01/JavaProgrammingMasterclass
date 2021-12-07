public class TeenNumberChecker {


    public static boolean hasTeen (int firstAge, int secondAge, int thirdAge) {

        return isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge);

    } // hasTeen method

    public static boolean isTeen (int firstAge) {

        return firstAge >= 13 && firstAge <= 19;

    } // isTeen method

} // TeenNumber class
