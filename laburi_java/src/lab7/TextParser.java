package lab7;

import java.util.HashMap;
import java.util.Objects;

public class TextParser {
    private String text;
    private String sentenceDelimiters = "[?.!;]+";
    private String wordsDelimiters = "[ \n\t-?.!;]+";
    private String lettersDelimiter = "[^a-zA-Z]";
    private String vowels = "[aeiouAEIOU]";
    private String consonants = "[b-df-hj-np-tv-z]";

    public TextParser(String text) {
        setText(text);
    }

    public void setText(String someText) {
        text = someText;
    }

    public int countSentences() {
        String sentences[] = split(sentenceDelimiters);
        return sentences.length;
    }

    public int countWords() {
        String words[] = getWords();
        return words.length;
    }

    public int countLetters() {
        return countVowels() + countConsonants();
    }

    public int countVowels() {
        String letters[] = split(vowels);
        int count = 0;
        for (String letter : letters) {
            count += letter.length();
        }
        return count;
    }

    public int countConsonants() {
        String letters[] = split(consonants);
        int count = 0;
        for (String letter : letters) {
            count += letter.length();
        }
        return count;
    }

    private String[] getWords() {
        return split(wordsDelimiters);
    }

    private String[] split(String delimiter) {
        return text.split(delimiter);
    }

    public void showTopFive() {
        String words[] = getWords();
        HashMap<String, Integer> top = new HashMap<>();
        for (String word : words) {
            Object val = top.get(word);
            if (Objects.isNull(val)) {
                top.put(word, 1);
            } else {
                top.put(word, (int) val + 1);
            }
        }
        for (int i = 0; i < 5; i++) {
            if (top.isEmpty()) {
                break;
            }
            String maxKey = "";
            for (String name: top.keySet()){
                int value = top.get(name);
                if (maxKey.equals("")) {
                    maxKey = name;
                } else if (value > top.get(maxKey)) {
                    maxKey = name;
                }
            }
            System.out.println(String.format("%3d: %s", top.get(maxKey), maxKey));
            top.remove(maxKey);
        }
    }

}
