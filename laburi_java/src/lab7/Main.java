package lab7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write some text below:");
//        String someText = sc.nextLine();
        String someText = "Salut. Ce faci. Ce fac? Nimic.";
        TextParser textParser = new TextParser(someText);
        System.out.println("Input text: " + someText);
        System.out.println("Number of sentences: " + textParser.countSentences());
        System.out.println("Number of words: " + textParser.countWords());
        System.out.println("Number of letters: " + textParser.countLetters());
        System.out.println("Number of vowels: " + textParser.countVowels());
        System.out.println("Number of consonants: " + textParser.countConsonants());
        textParser.showTopFive();
        sc.close();
    }
}
