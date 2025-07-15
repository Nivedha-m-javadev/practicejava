import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AnalyzeNames A = new AnalyzeNames();
        System.out.print("How many names do you want to enter? ");
        int count = sc.nextInt();
        sc.nextLine();
        A.inputNames(count);
        A.printNames();
    System.out.println("Enter names to print");
        char Letter = sc.next().charAt(0);
        A.CountNamesStartingWith(Letter);
        A.findLongestName();
        sc.close();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}