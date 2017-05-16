package chapter11;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * Thinking in Java
 * TOOD
 * Created by gweibin on 2017/5/16.
 */
public class Ex28 {

    public static void main(String[] args) {
        Random random = new Random();
        PriorityQueue<Double> priorityQ = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) priorityQ.offer(random.nextDouble());
        System.out.println(priorityQ);
        while (priorityQ.peek() != null) System.out.print(priorityQ.poll() + ", ");
    }
}
