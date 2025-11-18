package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any sentence ");
        String sentence = scanner.nextLine();

        WordCounter wordCounter = new WordCounter(sentence);

        wordCounter.printReport();

    }
}
