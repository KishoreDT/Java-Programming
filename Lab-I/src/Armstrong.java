import java.lang.Math;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n,temp,digit;
        int sum=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            n=sc.nextInt();
        }
        temp=n;
        while (temp > 0) {
            digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp/=10;
        }
        if (n == sum) {
            System.out.println("It is a Armstrong Number");
        }
        else {
            System.out.println("It is not a Armstrong Number");
        }
    }
}
