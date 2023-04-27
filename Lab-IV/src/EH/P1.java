package EH;

import java.util.*;

public class P1 {
    public static void main(String[] args) {
        try
        {
            String s = "Hello World";
            try (Scanner scn = new Scanner(System.in)) {
                System.out.println("Enter the index : ");
                int i = scn.nextInt();
                System.out.println("Char at that index: "+s.charAt(i));
            }
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
