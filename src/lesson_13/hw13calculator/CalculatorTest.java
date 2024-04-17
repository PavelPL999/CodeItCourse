package lesson_13.hw13calculator;

public class CalculatorTest {

    public static void main(String[] args) {
        ArithmeticCalculator ac = new ArithmeticCalculator(5, 2);
        ac.calculate(Operation.MULTIPLY);
    }
}
