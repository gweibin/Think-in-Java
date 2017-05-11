package chapter11;

import java.util.*;

/**
 * Created by linewell on 2017/5/10.
 */
public class Ex2 {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < 10; i++)
            c.add(i);
        for (Integer i : c)
            System.out.print(i + ",");
    }
}
