package Class;

import java.util.Scanner;

class Perimeter {
    double p;
    Perimeter(int r) {
        p=2*3.14*r;
    }
}

public class Circle {
    public static void main(String[] args) {
        int r;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius of Circle :");
            r=sc.nextInt();
        }
        Perimeter P = new Perimeter(r);
        System.out.println("Perimeter of the Circle : "+P.p);
    }
}
