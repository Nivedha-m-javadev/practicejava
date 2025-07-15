public class safedivision {
    int a = 10;
    int b = 0;

    public int divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
            return -1; // returning something even on error
        }
    }
}
