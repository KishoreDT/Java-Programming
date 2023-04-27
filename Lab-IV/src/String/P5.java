package String;

import java.lang.String;
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        String str;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter string :");
            str=sc.nextLine();
        }
        System.out.println("\nThe given string is :"+str+"\n");
        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("The first non repeated character in String is :"+str.charAt(i));
                break;
            }
        }
    }
}