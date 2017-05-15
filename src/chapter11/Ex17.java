package chapter11;

import java.util.*;

/**
 * Thinking in Java
 * TOOD
 * Created by gweibin on 2017/5/15.
 */
public class Ex17 {

    public static void main(String[] args) {
        Map<String, Gerbil> map = new LinkedHashMap<>();
        map.put("fuzzy", new Gerbil(1));
        map.put("spot", new Gerbil(2));
        map.put("tom", new Gerbil(3));
        map.put("lili", new Gerbil(4));
        map.put("mina", new Gerbil(5));

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.print("key:" + key + " ");
            map.get(key).hop();
        }
    }
}
