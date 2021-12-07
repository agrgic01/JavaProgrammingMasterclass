public class NumberInWord {


    public static void printNumberInWord(int number) {

        String printText = "OTHER";

        if (number == 0)
            printText = "ZERO";
        else if (number == 1)
            printText = "ONE";
        else if (number == 2)
            printText = "TWO";
        else if (number == 3)
            printText = "THREE";
        else if (number == 4)
            printText = "FOUR";
        else if (number == 5)
            printText = "FIVE";
        else if (number == 6)
            printText = "SIX";
        else if (number == 7)
            printText = "SEVEN";
        else if (number == 8)
            printText = "EIGHT";
        else if (number == 9)
            printText = "NINE";

        System.out.println(printText);

    } /* 'printNumberInWord' METHOD */


} /* 'NumberInWord' CLASS */
