import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class P3 {
    public static void main(String[] args) {
        String[] coins = { "Penny", "Nickel", "Dime", "Quarter", "Dollar" };
        Set<String> set = new TreeSet();
        for (int i = 0; i < coins.length; i++)
        set.add(coins[i]);
        System.out.println("\nMinimum set: ");
        System.out.println(Collections.min(set));
        System.out.println(Collections.min(set,String.CASE_INSENSITIVE_ORDER));
        System.out.println("\nMaximum set: ");
        System.out.println(Collections.max(set));
        System.out.println(Collections.max(set,String.CASE_INSENSITIVE_ORDER));
    }
}
