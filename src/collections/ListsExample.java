package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsExample {
    public static void main(String[] args) {
        List<Integer> data = new LinkedList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        System.out.println(data);
        System.out.println(data.size());
        System.out.println(data.get(1)); // data[1]
        data.set(1, 10); // data[1] = 10;
        System.out.println(data);
        for(Integer e : data) {
            System.out.println(e * e);
        }
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i) * data.get(i));
        }



        int repeats = 200000;
        long start = System.currentTimeMillis(); // время до
        for (int i = 0; i < repeats; i++) {
            data.add(0, i); // O(1)
        }
        long finish = System.currentTimeMillis(); // время после
        System.out.println("List finished in " + (finish - start));

        List<Integer> array = new ArrayList<>();
        start = System.currentTimeMillis();
        for(int i = 0; i < repeats; i++) {
            array.add(0, i); // O(n)
        }
        finish = System.currentTimeMillis();
        System.out.println("Array finished in " + (finish - start));


        start = System.currentTimeMillis();
        for(int i = 0; i < repeats; i++) {
            data.get(10000);
        }
        finish = System.currentTimeMillis();
        System.out.println("List " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < repeats; i++) {
            array.get(10000);
        }
        finish = System.currentTimeMillis();
        System.out.println("Array " + (finish - start));



    }
}
