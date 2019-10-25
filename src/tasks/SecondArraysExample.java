package tasks;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class SecondArraysExample {
    public static void main(String[] a) throws FileNotFoundException {

//        tasks.SecondArraysExample.main(new String[]{"run"});
        int[] array = new int[10];
        System.out.println(array[0]);
        array[0] = 10;
        array[1] = 11;
        System.out.println(array[0]);

        String[] names = new String[10];
        System.out.println(names[0]);
//        int length = names[0].length();

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        Integer.valueOf("123");

        Scanner sc = new Scanner(new File("input.txt"));
        int n = sc.nextInt();
        System.out.println(n);
        int [] mas = new int[n];
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            mas[i] = value;
        }
        System.out.println(mas[3]);

        // считает сумму элементов
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = result + mas[i];
        }
        System.out.println(result);

        // проверка упопрядоченности
//        boolean isOrdered = false;
        boolean isOrdered = true;
        for (int i = 0; i < n - 1; i++) {
            int current = mas[i];
            int next = mas[i + 1];
//            if (current < next) {
//                isOrdered = true;
//            } else {
//                isOrdered = false;
//                break;
//            }
            if(current > next) {
                isOrdered = false;
                break;
            }
        }
        System.out.println(isOrdered);


        for (int i = 0; i < n; i++) {
            int number = mas[i];
            int divider = 1;
            for (int j = 1; j < number; j++) {
                if (number % j == 0) { // делится
//                    System.out.print(i + " ");
                    divider = j;
                }
            }
            System.out.println(divider);
        }

    }
}
