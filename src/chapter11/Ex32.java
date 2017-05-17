package chapter11;

import typeinfo.pets.*;

import java.util.*;

/**
 * Thinking in Java
 * TOOD
 * Created by gweibin on 2017/5/16.
 */

class PetSequence {
    Pet[] pets = Pets.createArray(8);
}

public class Ex32 extends PetSequence {

    public static void main(String[] args) {
        Ex32 ex32 = new Ex32();
        Iterator<Pet> iterator = ex32.iterator();
        while (iterator.hasNext()) System.out.print(iterator.next() + " ");
        System.out.println();
        for (Pet pet : ex32.reversed()) System.out.print(pet + " ");
        System.out.println();
        for (Pet pet : ex32.randomized()) System.out.print(pet + " ");
    }

    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                List<Pet> shuffled = new ArrayList<>(Arrays.asList(pets));
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
            }
        };
    }

    public Iterable<Pet> reversed() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {

                    int index = pets.length - 1;

                    @Override
                    public boolean hasNext() {
                        return index > -1;
                    }

                    @Override
                    public Pet next() {
                        return pets[index--];
                    }
                };
            }
        };
    }

    public Iterator<Pet> iterator() {


        return new Iterator<Pet>() {

            int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }
}
