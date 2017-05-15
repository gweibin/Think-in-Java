package chapter11;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by linewell on 2017/5/12.
 */
public class Ex8 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for (int i = 0; i < 10; i++)
            gerbils.add(new Gerbil(i));
        Iterator<Gerbil> iterator = gerbils.iterator();
        while (iterator.hasNext()) iterator.next().hop();
    }
}