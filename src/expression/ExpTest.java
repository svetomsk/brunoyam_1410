package expression;

public class ExpTest {
    public static void main(String[] args) {
//        System.out.println(one.evaluate());
        Const one = new Const(1);
//        Const three = new Const(3);
//        Const four = new Const(4);
//        Const five = new Const(5);
//
//        Minus minus34 = new Minus(three, four);
//        Minus minus345 = new Minus(minus34, five);

        // x + 2
        Var x = new Var();
        Const two = new Const(2);


        Plus plus = new Plus(x, two);
        System.out.println(plus.evaluate(40));
    }
}
