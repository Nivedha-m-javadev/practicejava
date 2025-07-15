import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperationS OpS =new OperationS();
        System.out.println("Enter your name");
        String name = sc.nextLine();
        OpS.greet(name);

        System.out.println("Length of name: " + OpS.getlength(name));
        System.out.println("First letter: " + OpS.getChar(name));
        System.out.println("Uppercase: " + OpS.makeupperCase(name));
        System.out.println("Lowercase: " + OpS.makeLowercase(name));
        System.out.println("Reversed: " + OpS.Reverse(name));

    }
}