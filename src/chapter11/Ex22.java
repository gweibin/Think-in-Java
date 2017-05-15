package chapter11;

import utils.TextFile;

import java.util.*;

/**
 * Thinking in Java
 * TOOD
 * Created by gweibin on 2017/5/15.
 */
class Word {
    static int totalWord;
    int count;
    String word;

    public Word(int count, String word) {
        this.count = count;
        this.word = word;
        totalWord++;
    }

    @Override
    public String toString() {
        return word + ": " + count;
    }
}

public class Ex22 {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(new TextFile("src/chapter11/Ex6.java", "\\W+"));
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println(words);
        Set<Word> wordSet = new HashSet<>();
        Iterator<String> iterator = words.iterator();
        List<String> wordList = new ArrayList<>();
        int allcount = 0;
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (!wordList.contains(s)) {
                int count = 0;
                for (int i = 0; i < words.size(); i++) {
                    if (s.equals(words.get(i))) count++;
                    allcount++;
                }
                Word word = new Word(count, s);
                wordSet.add(word);
                wordList.add(s);
            }
        }
        System.out.println(allcount);
        System.out.println("word count:" + wordSet);
        System.out.println("Total words:" + Word.totalWord);
    }
}
