package chapter11;

import java.util.*;

/**
 * Thinking in Java
 * TOOD
 * Created by gweibin on 2017/5/15.
 */
public class Ex24 {
    public static void main(String[] args) {
        Map<String, Gerbil> map = new LinkedHashMap<>();
        map.put("fuzzy", new Gerbil(1));
        map.put("spot", new Gerbil(2));
        map.put("tom", new Gerbil(3));
        map.put("lili", new Gerbil(4));
        map.put("mina", new Gerbil(5));
        System.out.println(map);
        Set<String> keySet = new TreeSet<>(map.keySet());
        System.out.println(keySet);
        Map<String, Gerbil> temp = new LinkedHashMap<>();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            temp.put(key, map.get(key));
        }
        System.out.println(temp);

    }
}
