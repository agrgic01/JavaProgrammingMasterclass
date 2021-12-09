public class EvenDigitSum {


    public static int getEvenDigitSum(int number) {

        if (number < 0)
            return -1;

        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            sum += (lastDigit % 2 == 0) ? lastDigit : 0;
            number /= 10;
        } // while

        return sum;

    } /* 'getEvenDigitSum' METHOD */


} /* 'EvenDigitSum' CLASS */

