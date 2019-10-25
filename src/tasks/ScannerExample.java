package tasks;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        System.out.println(line);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);

        System.out.println("Введите имя: ");
        String name = sc.next();
        System.out.println("Привет, " + name);
        System.out.println("Привет, ".concat(name));

    }
}
