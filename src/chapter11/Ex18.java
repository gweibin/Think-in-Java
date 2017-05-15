package chapter11;

import java.util.*;

/**
 * Thinking in Java
 * TOOD
 * Created by gweibin on 2017/5/15.
 */
public class Ex18 {
    public static void main(String[] args) {
        Map<String, Gerbil> map = new HashMap<>();
        map.put("fuzzy", new Gerbil(1));
        map.put("spot", new Gerbil(2));
        map.put("tom", new Gerbil(3));
        map.put("lili", new Gerbil(4));
        map.put("mina", new Gerbil(5));
        System.out.println(map);
        Set<String> set = new TreeSet<>(map.keySet());
        System.out.println(set);
        Map<String, Gerbil> linkedHashMap = new LinkedHashMap<>();
        for (String key : set) {
            linkedHashMap.put(key, map.get(key));
        }
        System.out.println(linkedHashMap);
    }
}
