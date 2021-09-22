public abstract class Expression {
    public abstract double getValue();

    public boolean less_than(Expression other) {
        return this.getValue() < other.getValue();
    }

    public boolean equal_to(Expression other) {
        return this.getValue() == other.getValue();
    }

    public boolean greater_than(Expression other) {
        return this.getValue() > other.getValue();
    }
}
