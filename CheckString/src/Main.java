
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    NameSearch N = new NameSearch();
        System.out.print("Enter a name to search: ");
        String name = sc.nextLine();
    N.Serachname(name);
    sc.close();
    }
    }
