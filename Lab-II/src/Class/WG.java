package Class;

import java.util.Scanner;

class Weight {
    float gram=0,kg;
    Weight(float w,float g) {
        gram+=(w*75);
        gram+=(g*112);
        kg=gram/1000;
    }
}

public class WG {
    public static void main(String[] args) {
        float w,g;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter no. of Widgets :");
            w=sc.nextFloat();
            System.out.println("Enter no. of Gizmos :");
            g=sc.nextFloat();
        }
        Weight W = new Weight(w, g);
        System.out.println("\nThe no. of Widgets is "+w+" and the no. of Gizmos is "+g+" and the total Wigth is "+W.kg);
    }
}
