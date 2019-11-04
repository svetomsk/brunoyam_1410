package expression;

public class Minus extends BiExpression {

    public Minus(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double operation(double a, double b) {
        return a - b;
    }
}
