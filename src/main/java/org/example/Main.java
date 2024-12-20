package org.example;

public class Main {
    public static void main(String[] args) {
        /**
         * Create new int array and push 3 numbers.
         * */
        int[] numbers = new int[3];
        numbers[0] = 6;
        numbers[1] = 1;
        numbers[2] = 8;
        /**
         * Set initial index as a max value.
         * */
        int max_num = numbers[0];
        /**
         * For loop to check every index and change the max value accordingly.
         * */
        for(int i=0; i < numbers.length - 1; i++){
            if(max_num > numbers[i+1]) {}
            else{
                max_num = numbers[i+1];
            }
        }
        /**
         * Print max_value at the end.
         * */
        System.out.println(max_num);
    }
}