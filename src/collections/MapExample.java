package collections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> nameToNumber = new HashMap<>();
        nameToNumber.put("Ivan", 123456);
        Integer value = nameToNumber.put("Petr", 123446);
        System.out.println(value);
        nameToNumber.put("Nikolay", 122356);
        System.out.println(nameToNumber);
        Integer oldValue = nameToNumber.put("Ivan", 123555);
        System.out.println(nameToNumber);
        System.out.println(oldValue);

        nameToNumber.putIfAbsent("Ivan", 123);
        System.out.println(nameToNumber);
        nameToNumber.putIfAbsent("Ivan IV", 123);
        System.out.println(nameToNumber);

        Set<String> keys = nameToNumber.keySet();
        System.out.println(keys);
        List<Integer> values = new ArrayList<>(nameToNumber.values());
        System.out.println(values);


        List<Integer> elements = new ArrayList<>();
        elements.add(4);
        elements.add(2);
        elements.add(1);
//        Set<Integer> distinctElements = new HashSet<>(elements);
        Set<Integer> distinctElements = new HashSet<>();
        distinctElements.addAll(elements);
        System.out.println(distinctElements);

        Collections.sort(elements);
        System.out.println(elements);
        System.out.println(Collections.max(elements));
        System.out.println(Collections.min(elements));
        Collections.shuffle(elements);
        System.out.println(elements);
        System.out.println(Collections.singletonList(1));
        Collections.reverse(elements);
        System.out.println(elements);
    }
}
