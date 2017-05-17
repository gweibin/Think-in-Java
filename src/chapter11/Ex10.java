package chapter11;

import java.util.*;

/**
 * Thinking in Java
 * TOOD
 * Created by gweibin on 2017/5/12.
 */
class Rodent {
    private String name = "Rodent";

    protected void eat() {
        System.out.print("Rodent.eat()");
    }

    protected void run() {
        System.out.print("Rodent.run()");
    }

    protected void sleep() {
        System.out.print("Rodent.sleep()");
    }

    public String toString() {
        return name;
    }
}

class Mouse extends Rodent {
    private String name = "Mouse";

    protected void eat() {
        System.out.print("Mouse.eat()");
    }

    protected void run() {
        System.out.print("Mouse.run()");
    }

    protected void sleep() {
        System.out.print("Mouse.sleep()");
    }

    public String toString() {
        return name;
    }
}

class Rat extends Rodent {
    private String name = "Rat";

    protected void eat() {
        System.out.print("Rat.eat()");
    }

    protected void run() {
        System.out.print("Rat.run()");
    }

    protected void sleep() {
        System.out.print("Rat.sleep()");
    }

    public String toString() {
        return name;
    }
}

class Squirrel extends Rodent {
    private String name = "Squirrel";

    protected void eat() {
        System.out.print("Squirrel.eat()");
    }

    protected void run() {
        System.out.print("Squirrel.run()");
    }

    protected void sleep() {
        System.out.print("Squirrel.sleep()");
    }

    public String toString() {
        return name;
    }
}

public class Ex10 {


    public static void main(String[] args) {
        List<Rodent> rodents = new ArrayList<>();
        rodents.addAll(Arrays.asList(next(), next(), next(),next()));
        Iterator<Rodent> iterator = rodents.iterator();
        while (iterator.hasNext()) {
            Rodent rodent = iterator.next();
            System.out.print(rodent + ": ");
            rodent.eat();
            rodent.run();
            rodent.sleep();
            System.out.println();
        }
    }

    public static Rodent next() {
        switch (new Random().nextInt(3)) {
            default:
            case 0:
                return new Mouse();
            case 1:
                return new Rat();
            case 2:
                return new Squirrel();
        }
    }
}
