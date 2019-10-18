public class ArraysExample {
    public static void main(String[] args) {
        int[] mas = {1, 3, 2, 5, 6};
        System.out.println("Length = " + mas.length);
        System.out.println("Last element = " + mas[mas.length - 1]);
        System.out.println(mas);
        for (int i = 0; i < mas.length; i++) {
            int a = mas[i];
            System.out.print(mas[i] + " ");
        }

        String[] values = {"Hello", "Ivan"};
    }
}
