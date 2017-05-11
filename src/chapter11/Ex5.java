package chapter11;

import java.util.*;


/**
 * Created by linewell on 2017/5/11.
 */
public class Ex5 {
    public static void main(String[] args) {
        Random random = new Random(47);
        List<Integer> pets = listOfRandomInteger(7, random);
        System.out.println("1:" + pets);
        Integer h = new Integer(random.nextInt(10));
        pets.add(h);
        System.out.println("2:" + pets);
        System.out.println("3:" + pets.contains(h));
        pets.remove(h);
        Integer p = pets.get(2);
        System.out.println("4:" + p + " " + pets.indexOf(p));
        Integer cymric = new Integer(random.nextInt(10));
        System.out.println("5:" + pets.indexOf(cymric));
        System.out.println("6:" + pets.remove(cymric));
        System.out.println("7:" + pets.remove(p));
        System.out.println("8:" + pets);
        pets.add(3, new Integer(random.nextInt(10)));
        System.out.println("9:" + pets);
        List<Integer> sub = pets.subList(1, 4);
        System.out.println("sub:" + sub);
        System.out.println("10:" + pets.containsAll(sub));
        Collections.sort(sub);
        System.out.println("sorted sub:" + sub);
        System.out.println("pets:" + pets);
        System.out.println("11:" + pets.containsAll(sub));
        Collections.shuffle(sub, random);
        System.out.println("shuffle sub:" + sub);
        System.out.println("12:" + pets.containsAll(sub));
        List<Integer> copy = new ArrayList<Integer>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println("sub:" + sub);
        copy.retainAll(sub);
        System.out.println("13:" + copy);
        copy = new ArrayList<Integer>(pets);
        copy.remove(2);
        System.out.println("14:" + copy);
        copy.removeAll(sub);
        System.out.println("15:" + copy);
        copy.set(1, new Integer(random.nextInt(10)));
        System.out.println("16:" + copy);
        copy.addAll(2, sub);
        System.out.println("17:" + copy);
        System.out.println("18:" + pets.isEmpty());
        pets.clear();
        System.out.println("19:" + pets);
        System.out.println("20:" + pets.isEmpty());
        pets.addAll(listOfRandomInteger(4, random));
        System.out.println("21:" + pets);
        Object[] objects = pets.toArray();
        System.out.println("22:" + objects[3]);
        Integer[] pa = pets.toArray(new Integer[0]);
        System.out.println("23:"+pa[3]);
    }

    public static List<Integer> listOfRandomInteger(int initialCapacity, Random random) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < initialCapacity; i++) list.add(random.nextInt(10));
        return list;
    }
}
