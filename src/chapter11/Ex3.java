package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by linewell on 2017/5/10.
 */
public class Ex3 {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));
        System.out.println(collection);
        List<Integer> list = Arrays.asList(16,17,18);
        list.set(1,99);
        System.out.println(list);
        List list1 = new ArrayList();
        System.out.println(list1);
    }
}
