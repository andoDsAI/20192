public class Variable extends Expression {
    private double value;

    public Variable(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }
}
