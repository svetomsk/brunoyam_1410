package expression;

public class Const implements Expression {
    private double value;

    public Const(double value) {
        this.value = value;
    }

    @Override
    public double evaluate(int x) {
        return value;
    }
}
