import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter no. of units used :");
            n=sc.nextInt();
        }
        if (n<=100) {
            System.out.println("Your bill is " + n*1.2);
        }
        else if(n>100 && n<=300) {
            System.out.println("Your bill is " + n*2);
        }
        else {  
            System.out.println("Your bill is " + n*3);
        }
    }
}
