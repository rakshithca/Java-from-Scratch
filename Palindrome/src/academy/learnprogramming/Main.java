package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        isPalindrome(1233);
        sumFirstAndLastDigit(22);
        getEvenDigitSum(123456789);
        hasShareDigit(12, 23);
        gcd(55, 121);
        factors(6);
        perfecter(5);
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }


        if (original == reverse)
            System.out.println("palindrome" + number);
        else
            System.out.println("not a palindrome");
        return true;
    }

    // sum of only the first and last number in a string of number
    public static int sumFirstAndLastDigit(int number) {
        int first_digit, last_digit;
        if (number < 0) {
            System.out.println("Invalid value");
            return -1;
        } else {
            first_digit = number;
            while (first_digit >= 10) {
                first_digit = first_digit / 10;
            }

            last_digit = number % 10;
            number = first_digit + last_digit;

            System.out.println(number);
            return number;
        }
    }

    public static int getEvenDigitSum(int number) {
        // Reference - https://xiith.com/java-program-to-find-sum-of-even-digits-of-a-number
        int sum = 0, rem = 0;
        if (number < 0) {
            System.out.println("Invalid value");
            return -1;
        } else {
            while (number > 0) {
                rem = number % 10;
                if (rem % 2 == 0) {
                    sum = sum + rem;
                }
                number = number / 10;
            }

        }

        System.out.println(sum);
        return sum;
    }


    public static boolean hasShareDigit(int num1, int num2) {
        int lefta = num1 / 10;
        int righta = num1 % 10;
        int leftb = num2 / 10;
        int rightb = num2 % 10;
        if ((num1 < 10) || (num1 > 99) && (num2 < 10) || (num2 > 99)) {
            System.out.println("Invalid Value");
            return false;
        } else {
            System.out.println("Valid");
            return lefta == leftb || lefta == rightb || righta == leftb
                || righta == rightb;
        }

    }

    public static void gcd(int num1, int num2) {
        int gcd = 1;

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if ((num1 % i == 0) && (num2 % i == 0))
                gcd = i;
        }
        System.out.println(gcd);
    }

    public static void factors(int number) {
        if (number < 1) {
            System.out.println("Invaid Value");
        } else {
            System.out.println("Factors are:");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0)
                    System.out.println(i + " ");
            }
        }
    }


    public static void perfecter(int number) {
        int sum = 0;
        if (number < 1) {
            System.out.println("Invaid Value");
        } else {
            for (int i = 1; i < number; i++) {
                if (number % i == 0)
                    sum = sum + i;
            }
            if (sum == number)
                System.out.println("Perfect");
            else
                System.out.println("not perfect");
        }
    }

    public static void numberToWords(int number) {
        if (number < 1) {
            System.out.println("Invaid Value");
        } else{

        }
    }
}





