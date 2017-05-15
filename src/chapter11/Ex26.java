package chapter11;

import utils.TextFile;

import java.util.*;

/**
 * Thinking in Java
 * TOOD
 * Created by gweibin on 2017/5/15.
 */
public class Ex26 {
    public static void main(String[] args) {
        List<String> wordList = new LinkedList<>(new TextFile("src/chapter11/Ex22.java", "\\W+"));
        System.out.println(wordList);
        Map<String, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < wordList.size(); i++) {
            String word = wordList.get(i);
            ArrayList<Integer> arrayList = map.get(word);
            if (arrayList == null) {
                arrayList = new ArrayList<>(Arrays.asList(i));
            } else {
                arrayList.add(i);
            }
            map.put(word, arrayList);
        }
        System.out.println(map);
        Map<Integer, String> replay = new TreeMap<Integer, String>();
        for (Map.Entry<String, ArrayList<Integer>> word : map.entrySet()) {
            replay.put(word.getValue().get(0), word.getKey());
        }
        System.out.println(replay);
    }
}
