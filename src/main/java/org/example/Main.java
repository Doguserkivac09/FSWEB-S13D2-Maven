package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        int original = Math.abs(number);
        int temp = original;
        int reversed = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return original == reversed;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        if (number == 0) {
            return "Zero";
        }

        StringBuilder result = new StringBuilder();
        char[] digits = String.valueOf(number).toCharArray();

        for (int i = 0; i < digits.length; i++) {
            if (i > 0) {
                result.append(" ");
            }

            switch (digits[i]) {
                case '0':
                    result.append("Zero");
                    break;
                case '1':
                    result.append("One");
                    break;
                case '2':
                    result.append("Two");
                    break;
                case '3':
                    result.append("Three");
                    break;
                case '4':
                    result.append("Four");
                    break;
                case '5':
                    result.append("Five");
                    break;
                case '6':
                    result.append("Six");
                    break;
                case '7':
                    result.append("Seven");
                    break;
                case '8':
                    result.append("Eight");
                    break;
                case '9':
                    result.append("Nine");
                    break;
            }
        }

        return result.toString();
    }
}
