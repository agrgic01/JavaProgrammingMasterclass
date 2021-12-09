public class NumberPalindrome {


    public static boolean isPalindrome(int number) {

        if (number < 0)
            number *= -1;

        int startingNumber = number;
        int reverseNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            number /= 10;
        } // while

        return reverseNumber == startingNumber;

    } /* 'isPalindrome' METHOD */


} /* 'NumberPalindrome' CLASS */
