public class Main {
    public static void main(String[] args) {
        Expression a = new Variable(5);
        Expression b = new Variable(4);
        try {
            Expression a_multiple_b = new Sequence(a, b, new UnaryOperator("+"));
            System.out.println(a_multiple_b.getValue());
            Expression summation_a = new Sequence(a, b, new Summation());
            System.out.println(summation_a.getValue());
        } catch (ExpressionException e) {
            e.printStackTrace();
        }
    }
}
