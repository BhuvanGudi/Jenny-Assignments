package org.example;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user_input = scanner.nextLine();
        int sum = 0;
        for (char ch : user_input.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            } else {
                System.out.println("Invalid input. Please enter only numbers.");
                return;
            }
        }
        System.out.println(sum);
    }
}
