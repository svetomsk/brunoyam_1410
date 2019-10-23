import java.util.Random;

public class MethodsExample {

    public static void main(String[] args) {
        int k = 6;
        int result = sumOfNumbers(k, 5);
        System.out.println(result);
        System.out.println(k);

        int [] array = {1, 2, -23, -231};
        System.out.println(array[0]);
        int [] anotherArray = changeArray(array);
        anotherArray[0] = 1234;
        System.out.println(array[0]);
        System.out.println(countNegative(array));
    }

    public static int sumOfNumbers(int a, int b) {
        // int a = 6;
        // int b = 5;
        int result = a + b;
        a = 15;
        return result;
    }

    static int[] changeArray(int [] mas) {
        mas[0] = 123;
        return mas;
    }

    static int countNegative(int[] mas) {
        int count = 0;
        for(int e : mas) {
            if(e < 0) {
               count++;
            }
        }
        return count;
    }

    static int countEvenElements(int [] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            if(i % 2 == 0) {
                sum += mas[i];
            }
//            if(mas[i] % 2 == 0) {
//                sum += mas[i];
//            }
        }
        return sum;
    }

    private void sum () {

    }

    protected void sub() {

    }

    /*package-local*/ void foo() {

    }
}
