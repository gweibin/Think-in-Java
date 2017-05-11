package chapter11;

import java.util.*;

/**
 * Created by linewell on 2017/5/11.
 */
public class Ex4 {
    public static void main(String[] args) {
        Generator generator = new Generator();
        System.out.println(generator.fill(new ArrayList<String>(), 10));
        System.out.println(generator.fill(new LinkedList<String>(), 10));
        System.out.println(generator.fill(new HashSet<String>(), 10));
        System.out.println(generator.fill(new LinkedHashSet<String>(), 10));
        System.out.println(generator.fill(new TreeSet<String>(), 10));
        System.out.println(generator.fill(new HashMap<Integer, String>(), 10));
        System.out.println(generator.fill(new LinkedHashMap<Integer, String>(), 10));
        System.out.println(generator.fill(new TreeMap<Integer, String>(), 10));
    }
}


class Generator {

    int key = 0;

    public String next() {
        key++;
        switch (key) {
            default:
            case 1:
                return "盗梦空间";
            case 2:
                return "死神来了";
            case 3:
                return "肖生克的救赎";
            case 4:
                return "这个杀手不太冷";
            case 5:
                return "无间道";
            case 6:
                key = 0;
                return "源代码";
        }
    }

    public Collection fill(Collection<String> collection, int initialCapacity) {
        key = 0;
        for (int i = 0; i < initialCapacity; i++) collection.add(next());
        return collection;
    }

    public Map fill(Map<Integer, String> map, int initialCapacity) {
        key = 0;
        for (int i = 0; i < initialCapacity; i++) map.put(i, next());
        return map;
    }
}