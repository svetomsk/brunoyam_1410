package expression;

public class Plus extends BiExpression {
    public Plus(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double operation(double a, double b) {
        return a + b;
    }
}
