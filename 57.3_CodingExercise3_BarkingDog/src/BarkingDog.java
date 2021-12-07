public class BarkingDog {


    public static boolean shouldWakeUp (boolean isBarking, int hourOfDay) {

        /*// My Way
        if (hourOfDay < 0 || hourOfDay > 23)
            return false;

        if (isBarking) {
            if (hourOfDay >= 8 && hourOfDay <= 22)
                return false;
            else
                return true;
        } else
            return false;*/

        // Better Way
        if (!isBarking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23))
            return false;

        return true;

    } // shouldWakeUp method


} // BarkingDog Class
