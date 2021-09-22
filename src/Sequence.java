import java.util.Arrays;

public class Sequence extends Expression{
    private Expression expression1;
    private Expression expression2;
    private Operator operator;

    public Sequence(Expression expression1, Expression expression2, Operator operator) {
        this.expression1 = expression1;
        this.expression2 = expression2;
        this.operator = operator;
    }

    public Expression getExpression1() {
        return expression1;
    }

    public void setExpression1(Expression expression1) {
        this.expression1 = expression1;
    }

    public Expression getExpression2() {
        return expression2;
    }

    public void setExpression2(Expression expression2) {
        this.expression2 = expression2;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    @Override
    public double getValue() {
        return operator.compute(expression1, expression2);
    }
}
