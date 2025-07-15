public class NameSearch {

    String[] name = { "Nivedha", "Jahnvi", "Keshore", "Shivani", "Mugundan", "gayathri"};
    public void Serachname(String inputname){
        boolean found = false;
        int position = -1;
        for(int i=0;i<name.length;i++){
            if(name[i].equalsIgnoreCase(inputname)){
                found= true;
                position=1;
                break;
            }
        }
if(found){
    System.out.println("Name fount at ="+position);
}
else {
    System.out.println("Not found ");
}
    }
}

