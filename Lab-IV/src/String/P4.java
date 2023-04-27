package String;

import java.lang.String;
import java.util.Scanner;

public class P4 {
    public static void main(String[] args)
    {
        String str = "The quick brown fox jumps over the lazy dog.",s1,s2;
        System.out.println("\nOriginal string: "+str+"\n");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the word to be replaced :");
            s1=sc.nextLine();
            System.out.println("Enter the new word :");
            s2=sc.nextLine();
        }
        String new_str = str.replaceAll(s1, s2);
        System.out.println("\nNew String :"+new_str+"\n");
    }
}
