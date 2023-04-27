import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        int s;
        double a;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the side of Triangle :");
            s=sc.nextInt();
        }
        a=s*s*s*3/4;
        System.out.println("Area of the Trigngle is "+a);
    }
}