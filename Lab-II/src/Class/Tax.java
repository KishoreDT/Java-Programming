package Class;

import java.util.Scanner;

class Tip {
    float cost,tax,tip;
    Tip(float amt) {
        tax=(amt/100)*5;
        tip=(amt/100)*18;
        cost=amt+tax+tip;
    }
}

public class Tax {
    public static void main(String[] args) {
        float amt;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Amount of the Meal :");
            amt=sc.nextFloat();
        }
        Tip B = new Tip(amt);
        System.out.println("\nAmount of Meal : "+amt);
        System.out.println("Tax : "+B.tax);
        System.out.println("Amount of Meal including Tax : "+(amt+B.tax));
        System.out.println("Amount of Tip : "+B.tip);
        System.out.println("Total Amount of Meal : "+B.cost);
    }
}
