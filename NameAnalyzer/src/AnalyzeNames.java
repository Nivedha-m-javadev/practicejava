import java.util.Scanner;
public class AnalyzeNames {

    String[] names;
    public void inputNames(int count){
        Scanner sc = new Scanner(System.in);
        names= new String[count];
        for(int i=0;i<count;i++){

        System.out.println("Enter list of names"+(i+1)+":");
        names[i]=sc.nextLine();
        }

    }
    public void printNames() {
        System.out.println("\nList of names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
    public void CountNamesStartingWith(char Letter){
        int count =0;
        for(String name: names){
            if(name.toLowerCase().startsWith(String.valueOf(Letter).toLowerCase())){
                count++;
            }
        }
        System.out.println("Number of names starting with '" + Letter + "': " + count);
    }
    public void findLongestName(){
        String Longest= " ";
        for(String name:names){
            if(name.length()>Longest.length()){
                Longest=name;
            }
        }
        System.out.println("The longest name is: " + Longest);
    }

}
