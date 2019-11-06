package expression;

public class Var implements Expression {
    @Override
    public double evaluate(int x) {
        return x;
    }
}
