package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CollectionPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> values = new HashMap<>();
        // keys - input strings
        // values - number of copies
        while(true) {
            String inputValue = sc.nextLine();

            if(inputValue.equalsIgnoreCase("exit")) {
                break;
            }
            int n = values.getOrDefault(inputValue, 0); // old value for key
            values.put(inputValue, n + 1); // update incremented value
        }
        Set<String> keys = values.keySet();
        System.out.println(keys.size());
        System.out.println(keys);
        System.out.println(values);

    }
}
