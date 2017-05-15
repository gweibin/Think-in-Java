package chapter11;

import java.util.*;

/**
 * Thinking in Java
 * TOOD
 * Created by gweibin on 2017/5/12.
 */
public class Ex11 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(6, 7, 8, 9, 10));
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("aa", "bb", "cc"));
        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList("dd", "ee", "ff"));
        printAny(arrayList);
        printAny(linkedList);
        printAny(hashSet);
        printAny(treeSet);
    }

    public static void printAny(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next());
        System.out.println();
    }
}
