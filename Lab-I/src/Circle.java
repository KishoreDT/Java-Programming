import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        int r;
        double a;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius of the Circle :");
            r=sc.nextInt();
        }
        a=(r*r)*Math.PI;
        System.out.println("Area of the Circle is "+a);
    }
}