package Class;

import java.util.Scanner;

class Unit {
    int ut=0;
    Unit(int d, int h, int m, int s) {
        h+=(24*d);
        m+=(60*h);
        s+=(60*m);
        ut+=s;
    }
}

public class Time {
    public static void main(String[] args) {
        int d,h,m,s;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter no. of Days :");
            d=sc.nextInt();
            System.out.println("Enter no. of Hours :");
            h=sc.nextInt();
            System.out.println("Enter no. of Minutes :");
            m=sc.nextInt();
            System.out.println("Enter no. of Seconds :");
            s=sc.nextInt();
        }
        Unit T = new Unit(d, h, m, s);
        System.out.println("\nThe Total Seconds for "+d+" Days "+h+" Hours "+m+" Minutes "+s+" Seconds is "+T.ut);
    }
}
