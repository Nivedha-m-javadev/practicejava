import java.awt.*;

public class ArrayIteration {
    String[] fruits = {"Apple", "Banana", "Mango", "Peach", "Guava"};

        try {
        // trying to access the 6th fruit (index 5) — but only 0 to 4 exist
        System.out.println("My favorite fruit: " + fruits[5]);
    }
        catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Oops babe! That fruit doesn't exist ");
    }
}

