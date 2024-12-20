package org.example;

public class Main {
    public static void main(String[] args) {
        int max_num = 0;
        int[] numbers = new int[3];
        numbers[0] = 6;
        numbers[1] = 1;
        numbers[2] = 8;
        max_num = numbers[0];
        for(int i=0; i < numbers.length - 1; i++){
            if(max_num > numbers[i+1]){
            }else{
                max_num = numbers[i+1];
            }
        }
        System.out.println(max_num);
    }
}