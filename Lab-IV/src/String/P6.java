package String;

import java.lang.String;
import java.util.Scanner;

public class P6 {
    static void splitString(String str, int n) {
        int size = str.length();
        int part_size;
        if (size % n != 0) {
            System.out.println("The size of the given string is not divisible by "+n);
            return;
        } 
        else {
            System.out.println("\nThe given string is :"+str);
            System.out.println("\nThe string divided into "+n+"parts and they are :");
            part_size = size / n;
            for (int i = 0; i < size; i++) {
                if (i % part_size == 0) System.out.println();
                System.out.print(str.charAt(i));
            }
        }
    }
    
    public static void main(String[] args) {
        String str;
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter string :");
            str=sc.nextLine();
            System.out.println("Enter no. of split :");
            n=sc.nextInt();
        }
        splitString(str, n);
    }
}
