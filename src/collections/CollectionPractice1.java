package collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CollectionPractice1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        int n = sc.nextInt();
        Map<Integer, Integer> dayToTemp = new HashMap<>(); // создаем соответствие
        List<Integer> temperature = new ArrayList<>(); // создаем список для температуры
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int temp = sc.nextInt();
            dayToTemp.put(day, temp); // складываем новую пару значений в Map
            temperature.add(temp); // добавляем новую температуру в список
            System.out.println(day + " " + temp);
        }
        System.out.println(dayToTemp);
        System.out.println(temperature);

        // сложить данные в Map - DONE
        // сложить температуру в отдельный List (сохранить порядок) - DONE
        // считать команду
        // выполнить соответствующее действие
//        temperature.subList(1, 2)
        Scanner input = new Scanner(System.in);
        String command = input.next();
        if(command.equalsIgnoreCase("get")) {
            int day = input.nextInt();
            System.out.println(dayToTemp.getOrDefault(day, 0));
        } else if(command.equalsIgnoreCase("average")) {
            int startDay = input.nextInt();
            int endDay = input.nextInt();
            double sum = 0;
            for(int i = startDay - 1; i < endDay; i++) {
                sum += temperature.get(i);
            }
            System.out.println(sum / (endDay - startDay + 1));
        } else if(command.equalsIgnoreCase("min")) {
            int startDay = input.nextInt();
            int endDay = input.nextInt();
            int min = Integer.MAX_VALUE; // Integer.MIN_VALUE
            for (int i = startDay - 1; i < endDay; i++) {
                min = Math.min(min, temperature.get(i));
            }
            System.out.println(min);
        } else if(command.equalsIgnoreCase("max")) {
            System.out.println(Collections.max(temperature.subList(input.nextInt() - 1, input.nextInt())));
        }
    }
}
