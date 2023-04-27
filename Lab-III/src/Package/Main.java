package Package;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 1st Number : ");
            a = sc.nextInt();
            System.out.print("Enter 2nd Number : ");
            b = sc.nextInt();
        }
        System.out.println("\n");
        Add A = new Add(a,b);
        A.display();
        Sub S = new Sub(a,b);
        S.display();
        Mul M = new Mul(a,b);
        M.display();
        Div D = new Div(a,b);
        D.display();
    }
}
