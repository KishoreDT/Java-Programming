package String;

import java.lang.String;
import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        String s1,s2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter string 1 :");
            s1=sc.nextLine();
            System.out.println("Enter string 2 :");
            s2=sc.nextLine();
        }
        System.out.println("\nThe length of '"+s1+"' is "+s1.length());
        System.out.println("\nCompare To : "+s1.compareTo(s2));
        System.out.println("\nIs Empty : "+s1.isEmpty());
        System.out.println("\nTo Upper Case : "+s1.toUpperCase());
        System.out.println("\nTo Lower Case : "+s1.toLowerCase());
        System.out.println("\nReplace : "+s1.replace(s1, s2));
        System.out.println("\nEquals : "+s1.concat(s2));
    }
}
