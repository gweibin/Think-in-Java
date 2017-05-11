package chapter11;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by linewell on 2017/5/11.
 */
public class Ex7 {
    public static void main(String[] args) {
        Tester[] testers = new Tester[10];
        for (int i = 0; i < testers.length; i++) {
            testers[i] = new Tester();
        }
        List<Tester> testerList = new ArrayList<Tester>();
        for (Tester tester : testers) testerList.add(tester);
        System.out.println("testerList:" + testerList);
        List<Tester> sub = testerList.subList(1, 4);
        System.out.println("sub:" + sub);
        List<Tester> copy = new ArrayList<Tester>(testerList);
        System.out.println("copy:" + copy);
        copy.removeAll(sub);
        System.out.println("copy:" + copy);
        testerList = copy;
        System.out.println("sub:" + sub);
        System.out.println("testerList" + testerList);
    }
}

class Tester {
    public static int count = 0;
    private int id = count++;

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}

