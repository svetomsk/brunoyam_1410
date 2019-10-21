public class ArraysExample {
    public static void main(String[] args) {
        int[] mas = {-1, -3, 2, -5, 6};
        System.out.println("Length = " + mas.length);
        System.out.println("Last element = " + mas[mas.length - 1]);
        System.out.println(mas);
        for (int i = 0; i < mas.length; i++) {
            int a = mas[i];
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        // в обратном порядке
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[mas.length - 1 - i] + " ");
        }
        System.out.println();
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        // min max
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if(mas[i] < min) {
                min = mas[i];
            }

            min = Math.min(min, mas[i]);
        }
        System.out.println("Minimum = " + min);
        System.out.println(Math.pow(2, 5));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.cbrt(8));
        System.out.println(Math.abs(-15));
        System.out.println(Math.floor(14.95));
        System.out.println(Math.round(14.35));

        // max length string
        String[] values = {"Hello", "Ivan", "1234567"};
        String maxString = values[0];
        int maxLen = values[0].length();
        for (int i = 0; i < values.length; i++) {
            String current = values[i];
            if(current.length() > maxLen) {
                maxString = current;
                maxLen = current.length();
            }
        }
        System.out.println("Str: " + maxString + " len: " + maxLen);

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length - i - 1; j++) {
                if(mas[j] > mas[j + 1]) {
                    int tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
