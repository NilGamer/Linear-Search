package LinearSearch;

public class EvenDigits {
    // Q: have to find how many numbers in array is of even digit length
    // ex= 12 is even because 2 digit and 123 is odd because 3 digit
    public static void main(String[] args) {
        int[] arr = { 12, 123, 45, 65432, 39 };

        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (isEven(num)) {
                count++;
            }
        }

        return count;
    }

    // this method will number of digits is even or not
    static boolean isEven(int num) {
        /*
         * There are two ways to check that
         * 1. count the no. of digits
         * 2. convert number into string and check its length
         */

        int numLen = digits2(num);

        // if (numLen % 2 == 0) {
        // return true;
        // }
        // return false;

        return numLen % 2 == 0;
    }

    static int digits2(int num) {
        // shortcut
        return (int) (Math.log10(num)) + 1;
    }

    // will return number of digits
    static int digits(int num) {
        // for negative number
        if (num < 0) {
            num *= -1;
        }

        if (num == 0) {
            return 1;
        }

        int numLen = 0;
        while (num > 0) {
            numLen++;
            num /= 10;
        }
        return numLen;
    }
}
