package org.example;
import java.util.Scanner;

public class YoutubeChannelNameGenerator {
    public static void main(String[] args) {
        System.out.println("Welcome to YouTube Channel Name Generator!!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your nick name? ");
        String name = scanner.nextLine();
        System.out.println("What is the next word you want to add? ");
        String nextWord = scanner.nextLine();
        System.out.println("Your YT Channel Name could be: " + name + " " +
                nextWord);
    }
}
