package chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Thinking in Java
 * TOOD
 * Created by gweibin on 2017/5/15.
 */
public class Ex23 {
    public static void main(String[] args) {
        statistics(10);
    }

    public static void statistics(int runCount) {
        for (int i = 0; i < runCount; i++) {
            Random random = new Random(47);
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < 10000; j++) {
                int r = random.nextInt(20);
                Integer freq = map.get(r);
                map.put(r, freq == null ? 1 : freq + 1);
            }
            System.out.println(map);
        }
    }
}
