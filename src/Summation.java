public class Summation extends Operator {
    @Override
    public double compute(Expression expression1, Expression expression2) {
        float sum = 0;
        for (int i = 1; i <= expression2.getValue(); i++) {
            sum += expression1.getValue() * i;
        }
        return sum;
    }
}
