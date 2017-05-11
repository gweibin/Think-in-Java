package chapter11;

import java.util.*;

/**
 * @description：TOOD
 * @author：gweibin@linewell.com
 * @create：2017/5/9
 */

class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("Gerbil " + gerbilNumber + " hops");
    }

}

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for (int i = 0; i < 10; i++)
            gerbils.add(new Gerbil(i));
        for (int i = 0; i < 10; i++)
            gerbils.get(i).hop();
        // or, alternatively, using foreach syntax:
        for (Gerbil g : gerbils)
            g.hop();

    }
}