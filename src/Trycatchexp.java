public class Trycatchexp {
    public int i, answer;

    public Trycatchexp(String name, int i) {
        this.i = i; // store the value in the class variable
        try {
            int answer = 10 / this.i;  // division that might fail
            System.out.println("Answer: " + answer);
        } catch (ArithmeticException e) {
            System.out.println("OUCH! Can't divide by zero.");
        }
    }
}