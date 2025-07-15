import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        CalculatorClass C= new CalculatorClass();
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2= sc.nextInt();
        C.greetuser();
        int res= C.add(num1,num2);
        System.out.println("res ="+res);
        int prod = C.multiply(num1,num2);
        System.out.println("prod =" + prod);
        int div = C.divide(num1,num2);
        System.out.println("div =" + div);
sc.close();
    }
}
