package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private String text;

    public WordCounter(String text) {
        this.text = text;
    }


    public int countWords(){
        int count = 0;
        boolean inWord = false;
        char[] textArr = text.toCharArray();

        for(char c:textArr){
            if(Character.isWhitespace(c) || !Character.isAlphabetic(c)){
                inWord = false;
            }
            else if(!inWord){
                inWord = true;
                count++;
            }
        }
        return count;
    }

    public String[]words(){
        return text.toLowerCase().split("\\W+");
    }

    public Map<String, Integer> wordFrequency(){

        Map<String, Integer> uniqueWords = new HashMap<>();
        String[]words = words();

        for (int i = 0; i < words.length; i++) {
            uniqueWords.put(words[i], 0);
        }

        for(String word : words){
            uniqueWords.put(word, uniqueWords.getOrDefault(word, 0)+1);
        }

        return uniqueWords;
    }


    public int countUniqueWords(){
        Map<String, Integer> uniqueWords = wordFrequency();
        int counter = 0;
        for (int i = 0; i < uniqueWords.size(); i++) {
            counter++;
        }
        return counter;
    }



    public void printReport(){
        int wordCount = countWords();
        Map<String, Integer>uniqueWords = wordFrequency();
        int countUniqueWords = countUniqueWords();

        System.out.println("==============================");
        System.out.println("Text: " + text);
        System.out.println("Total number of words: " +wordCount);
        System.out.println("Total number of UNIQUE words: "+countUniqueWords+"\n{");

        for (String key : uniqueWords.keySet()) {
            System.out.println(key + ": " + uniqueWords.get(key) + " times");
        }
        System.out.println("}");
        System.out.println("==============================");



    }
}
