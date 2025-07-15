public class CalculatorClass {
    public void greetuser() {
        System.out.println("Hi there welcome!");
    }
    public int add(int a, int b){
        int sum= a+b;
        return sum;
}
public int multiply( int a, int b){
        return a * b;
}
public int divide(int a , int b){
        try{
            return a / b;
        }
        catch(ArithmeticException e){
            System.out.println("Oops cant print");
            return 0;

        }


}
}





