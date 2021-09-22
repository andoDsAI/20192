import java.util.Arrays;

public class UnaryOperator extends Operator {
    private final static String[] validOperator = {"+", "-", "*", "/"};
    private final String type;

    public UnaryOperator(String type) throws ExpressionException {
        if (Arrays.asList(validOperator).contains(type)) {
            this.type = type;
        } else {
            throw new ExpressionException("Invalid operator");
        }
    }

    @Override
    public double compute(Expression expression1, Expression expression2) {
        return switch (this.type) {
            case "+" -> expression1.getValue() + expression2.getValue();
            case "-" -> expression1.getValue() - expression2.getValue();
            case "*" -> expression1.getValue() * expression2.getValue();
            case "/" -> expression1.getValue() / expression2.getValue();
            default -> 0;
        };
    }
}
