public class ExponentialOperator extends Operator {
    @Override
    public double compute(Expression expression1, Expression expression2) {
        return Math.pow(expression1.getValue(), expression2.getValue());
    }
}
