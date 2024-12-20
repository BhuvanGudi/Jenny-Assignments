package org.example;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Please enter the year between 0 and 10,000");
        System.out.println("Do not enter negative or alphabets");
        /**
         * To have an input from the user, we use scanner.
         * */
        Scanner scanner = new Scanner(System.in);
        /**
         * Store the following user input.
         * */
        int user_input = scanner.nextInt();
        /**
         * Check the following user input.
         * */
        if(user_input < 0 || user_input > 10000){
            System.out.println("Invalid input");
        }else{
            /**
             * If user input satisfies the conditions, check if it is a leap year.
             * */
            if(user_input % 4 == 0) {
                System.out.print(user_input);
                System.out.print(" is a leap year!");
            }else{
                System.out.print(user_input);
                System.out.print(" is not a leap year...");
            }
        }

    }
}
