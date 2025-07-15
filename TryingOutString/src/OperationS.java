public class OperationS {
    public void greet(String name) {
        System.out.println("Hi =" + name + " ,Welcome !");
    }
        public int getlength(String name){
        return name.length();
    }
    public char getChar(String name){
        try {
            return name.charAt(0); // risky if name is empty
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Oops! Name is empty, no first character.");
            return '-'; // fallback char
        }
    }
    public String makeupperCase(String name){
        return name.toUpperCase();

    }
    public String makeLowercase(String name){
        return name.toLowerCase();
    }
    public String Reverse(String name){
        String reverse=" ";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
    }
        return reverse;
}}
