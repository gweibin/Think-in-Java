package chapter11;

import java.nio.channels.Selector;
import java.util.Iterator;

/**
 * Thinking in Java
 * TOOD
 * Created by gweibin on 2017/5/12.
 */

public class Ex9 {
    private Object[] items;
    private int next = 0;

    public Ex9(int size) {
        items = new Object[size];
    }

    public static void main(String[] args) {
        Ex9 sequence = new Ex9(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
//        Selector selector = sequence.selector();
//        while (!selector.end()) {
//            System.out.print(selector.current() + " ");
//            selector.next();
        Iterator iterator = sequence.iterator();
        while (iterator.hasNext()) System.out.printf(iterator.next() + " ");
    }


    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    public Iterator iterator() {
        return new SequenceSelector();
    }

    private class SequenceSelector implements Iterator {
        private int i = 0;


        @Override
        public boolean hasNext() {
            return i < items.length;
        }

        @Override
        public Object next() {
            return items[i++];
        }

    }


}
