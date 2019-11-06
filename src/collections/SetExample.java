package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
        set.add(4);
        System.out.println(set);
        System.out.println(set.contains(1));
        System.out.println(set.contains(8));

        Integer value = 123;
        System.out.println(value.hashCode());
        Long bigValue = 1000000000000000000L;
        System.out.println(bigValue.hashCode());
        String first = "first";
        String second = "second";
        System.out.println(first.hashCode() + " " + second.hashCode());


        int numberOfElement = 1000000;
        int containsCount = 1000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < numberOfElement; i++) {
            set.add(i);
        }
        for (int i = 0; i < containsCount; i++) {
            set.contains(-1);
        }
        System.out.println("Set time " + (System.currentTimeMillis() - start));

        List<Integer> array = new ArrayList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < numberOfElement; i++) {
            array.add(i);
        }
        for (int i = 0; i < containsCount; i++) {
            array.contains(-1); // O(n)
        }

        for(Integer i : array) {
            if(!set.contains(i)) {
                // remove from DB
            }
//            for(Integer j : array) {
//
//            }
        }
        System.out.println("Array time " + (System.currentTimeMillis() - start));

    }
}
