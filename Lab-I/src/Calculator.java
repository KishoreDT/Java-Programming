import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int x,y,ch;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1st number :");
            x=sc.nextInt();
            System.out.println("Enter 2nd number :");
            y=sc.nextInt();
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
            System.out.println("Enter your choise :");
            ch=sc.nextInt();
        }
        if (ch==1) {
            System.out.println("Your answer is "+(x+y));
        }
        else if (ch==2) {
            System.out.println("Your answer is "+(x-y));
        }
        else if (ch==3) {
            System.out.println("Your answer is "+(x*y));
        }
        else if (ch==4) {
            System.out.println("Your answer is "+(x/y));
        }
        else {
            System.out.println("Wrong Choise");
        }
    }
}
