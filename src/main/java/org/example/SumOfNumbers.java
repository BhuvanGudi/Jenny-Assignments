package org.example;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user_input = scanner.nextLine();
        /**
         * As an initial start, set a sum to value 0.
         * */
        int sum = 0;
        /**
         * Check weather the following input is an integer.
         * */
        for (char ch : user_input.toCharArray()) {
            /**
             * Add each digit to the sum
             * */
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            } else {
                /**
                 * Print out the following error message and return with sum as 0.
                 * */
                System.out.println("Invalid input. Please enter only numbers.");
                return;
            }
        }
        /**
         * Print out sum of the digits in a given number.
         * */
        System.out.println(sum);
    }
}
