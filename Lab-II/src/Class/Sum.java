package Class;

import java.util.Scanner;

class Digit {
    int sum=0,digit;
    Digit(int n) {
        while (n>0) {
            digit = n % 10;  
            sum += digit;  
            n = n / 10; 
        }
    }
}

public class Sum {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            n=sc.nextInt();
        }
        Digit s = new Digit(n);
        System.out.println("Sum of Digits : "+s.sum);  
    }
}
