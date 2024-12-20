package org.example;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Please enter the year between 0 and 10,000");
        System.out.println("Do not enter negative or alphabets");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextInt() < 0 || scanner.nextInt() > 10000){
            System.out.println("Invalid input");
        }else{
            if(scanner.nextInt() % 4 == 0) {
                System.out.print(scanner.nextInt());
                System.out.print(" is a leap year!");
            }else{
                System.out.print(scanner.nextInt());
                System.out.print(" is not a leap year...");
            }
        }

    }
}