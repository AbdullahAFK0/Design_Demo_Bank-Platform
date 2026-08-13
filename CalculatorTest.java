public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        if (calculator.addition(10, 5) != 15) {
            throw new RuntimeException("Addition test failed");
        }

        if (calculator.subtraction(10, 5) != 5) {
            throw new RuntimeException("Subtraction test failed");
        }

        if (calculator.multiplication(10, 5) != 50) {
            throw new RuntimeException("Multiplication test failed");
        }

        if (calculator.division(10, 5) != 2) {
            throw new RuntimeException("Division test failed");
        }

        System.out.println("All tests passed!");
    }
}