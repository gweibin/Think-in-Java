package chapter11;

import utils.TextFile;

import java.util.*;

/**
 * Thinking in Java
 * TOOD
 * Created by gweibin on 2017/5/15.
 */
public class Ex21 {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(new TextFile("src/chapter11/Ex16.java", "\\W+"));
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println(words);
        vomelCounter(words);
    }

    public static void vomelCounter(List<String> sets) {
        Set<Character> vomels = new TreeSet<>();
        Map<Character, Integer> map = new HashMap<>();
        Collections.addAll(vomels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        int allVomels = 0;
        for (String str : sets) {
            int count = 0;
            for (Character vomel : str.toCharArray()) {
                if (vomels.contains(vomel)) {
                    Integer vomelCount = map.get(vomel);
                    map.put(vomel, vomelCount == null ? 1 : vomelCount + 1);
                    count++;
                    allVomels++;
                }
            }
            System.out.print(str + ":" + count + ", ");
        }
        System.out.println();
        System.out.println(map);
        System.out.println("Total vomels:" + allVomels);
    }
}
