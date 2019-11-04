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

        int n = 400000;
        for (int i = 0; i < n; i++) {
            data.add(0, i);
        }
        System.out.println("List finished");

        List<Integer> array = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            array.add(0, i);
        }
        System.out.println("Array finished");



    }
}
