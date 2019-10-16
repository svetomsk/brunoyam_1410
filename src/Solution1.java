public class Solution1 {
    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        int c = 123;
        if(a > b && a > c) {
            System.out.println(a);
        } else if(b > c &&  b > a) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        int x = -10;
        int y = 10;
        if(x > 0 && y > 0) {
            System.out.println(1);
        } else if(x > 0 && y < 0) {
            System.out.println(4);
        } else if(x < 0 && y > 0) {
            System.out.println(2);
        } else if(x < 0 && y < 0){
            System.out.println(3);
        } else {
            System.out.println("Axes");
        }

        int value = 123;
        if(value % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }

    }
}
