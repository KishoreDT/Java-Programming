import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int n,sb,ct;
        float sgpa,tc=0,gc=0;
        List<Integer> s = new ArrayList<Integer>();
        List<Integer> c = new ArrayList<Integer>();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter total no. of subjects :");
            n=sc.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.println("Enter Course GP and Cerdit for Subject "+i+" :");
                sb=sc.nextInt();
                ct=sc.nextInt();
                s.add(sb);
                c.add(ct);
            }
        }
        for (int i = 0; i < s.size(); i++) {
            gc+=(s.get(i)*c.get(i));
            tc+=c.get(i);
        }
        sgpa=gc/tc;
        System.out.println("Your SGPA is "+sgpa);
    }
}
