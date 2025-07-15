//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        safedivision babeCalc = new safedivision();  // creating the object

        // Try dividing 10 by 0 (should trigger error)
        babeCalc.divide(10, 0);

        // Try dividing 10 by 2 (should print result)
        babeCalc.divide(10, 2);
    }
}
