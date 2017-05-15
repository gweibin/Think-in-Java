package chapter11;

import java.util.*;

/**
 * Thinking in Java
 * TOOD
 * Created by gweibin on 2017/5/13.
 */
public class Ex12 {

    public static void main(String[] args) {
        Random random = new Random(16);
        List<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);
        List<Integer> list1 = new ArrayList<>(10);
        ListIterator<Integer> iterator = list.listIterator( );
        while (iterator.hasNext())
            iterator.next();
        while (iterator.hasPrevious())
            list1.add(iterator.previous());
        System.out.println(list1);
    }
}
