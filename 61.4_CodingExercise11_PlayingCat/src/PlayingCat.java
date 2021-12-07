public class PlayingCat {


    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer && (temperature > 24 && temperature < 46))
                return true;

        return temperature > 24 && temperature < 36;

        /*
        *         int upperLimit = summer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
        * */

    }


} /* 'PlayingCat' CLASS */
