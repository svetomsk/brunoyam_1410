package expression;

public class ExpTest {
    public static void main(String[] args) {
//        System.out.println(one.evaluate());
        Const one = new Const(1);
        Const two = new Const(2);
//        Const three = new Const(3);
//        Const four = new Const(4);
//        Const five = new Const(5);
//
//        Minus minus34 = new Minus(three, four);
//        Minus minus345 = new Minus(minus34, five);

        Plus plus = new Plus(one, two);
        System.out.println(plus.evaluate());
    }
}
