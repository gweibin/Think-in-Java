package chapter11;

import java.util.PriorityQueue;

/**
 * Thinking in Java
 * TOOD
 * Created by gweibin on 2017/5/16.
 */
class Simple extends Object{}

public class Ex29 {
    public static void main(String[] args) {
        PriorityQueue<Simple> priorityQ = new PriorityQueue<>();
        priorityQ.offer(new Simple());
        priorityQ.offer(new Simple());
        priorityQ.offer(new Simple());
    }
}
