package chapter11;

import java.util.*;

/**
 * Thinking in Java
 * TOOD
 * Created by gweibin on 2017/5/15.
 */
public class Ex19 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("fuzzy");
        set.add("spot");
        set.add("tom");
        set.add("lili");
        set.add("mina");
        System.out.println(set);
        Set<String> treeSet = new TreeSet<>(set);
        System.out.println(treeSet);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (String str : treeSet) {
            linkedHashSet.add(str);
        }
        System.out.println(linkedHashSet);
    }
}
