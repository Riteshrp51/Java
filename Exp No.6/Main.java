import ExceptionHandlingDemo.Calculator;
import ExceptionHandlingDemo.DivisionException;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = 10;
        int b = 0;

        try {
            int result = calc.divide(a, b);
            System.out.println("Result: " + result);
        } catch (DivisionException e) {
            System.out.println(e.getMessage());
        }
    }
}

//Error: Cannot divide by zero.