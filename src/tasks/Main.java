package tasks;

public class Main {
    // psvm + Tab
    public static void main(String[] args) {
        // sout + Tab
        System.out.println("Hello, world!");



        int a = 15;
        int b = 25;

        int sum = (a + b)* (b + 10); // 15 + 25 + 10
        System.out.println(sum);

        a = 35;

        int sub = a - b;
        System.out.println(sub);

        int mul = a * b;
        System.out.println(mul);

        int div = b / a;
        System.out.println(div);

        int mod = b % a;
        System.out.println(mod);

        double c = 15.0;
        double d = 25;
        System.out.println(d / c + 5.5);

        byte value = 127;
        int intValue = value;

        long huge = 100000000000000L;
        int hugeInt = (int) huge;


        double average = (1.0 + 2 + 3 + 4) / 4;
        System.out.println(average);
    }
}
