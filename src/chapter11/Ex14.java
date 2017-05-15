package chapter11;

import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

/**
 * Thinking in Java
 * TOOD
 * Created by gweibin on 2017/5/13.
 */
public class Ex14 {
    public static void main(String[] args) {
        Random random = new Random(16);
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(linkedList.size() / 2, random.nextInt(10));
            System.out.println("LinkedList<Integer>:" + linkedList);

        }

    }
}
