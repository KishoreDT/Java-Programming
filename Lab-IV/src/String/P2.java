package String;

import java.lang.String;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        String s;
        int wc=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Paragraph :");
            s=sc.nextLine();
        }
        String[] arrOfStr = s.split(" ");
        for (int i = 0; i < arrOfStr.length; i++) {
            if (arrOfStr[i].equals("hi") || arrOfStr[i].equals("Hi") || arrOfStr[i].equals("HI")) {
                wc+=1;
            }
        }
        System.out.println("No. of times 'Hi' in Paragraph = "+wc);
    }
}
