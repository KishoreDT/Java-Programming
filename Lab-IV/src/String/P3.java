package String;

import java.lang.String;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        String s1,s2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter string 1 :");
            s1=sc.nextLine();
            System.out.println("Enter string 2 :");
            s2=sc.nextLine();
        }
        System.out.println("Comparing "+s1+" and "+s2+": " + s1.contentEquals(s2));
    }
}
