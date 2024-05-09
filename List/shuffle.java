package List;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class shuffle {
    public static void main(String[] args) {
        if (args == null) {
            System.out.println("No arguments provided.");
            return;
        }

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            l.add(i);
        }

        Random random = new Random();
        Collections.shuffle(l, random);
        System.out.println(l);
    }
}
