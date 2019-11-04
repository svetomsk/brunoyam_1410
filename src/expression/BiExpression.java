package expression;

public abstract class BiExpression implements Expression {
    private Expression left;
    private Expression right;

    public BiExpression(Expression left,  Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate() {
        double leftValue = left.evaluate();
        double rightValue = right.evaluate();
        return operation(leftValue, rightValue);
    }

    public abstract double operation(double a, double b);
}