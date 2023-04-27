import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class P2 {
    public static void main(String[] args) {
        String[] coins = {"Mango","Apple", "Jackfruit", "Grapes", "Orange"};
        List<String> l = new ArrayList();
        Collections.addAll(l, coins);
        ListIterator<String> liter = l.listIterator();
        System.out.println("\nOriginal collection :");
        while (liter.hasNext())
            System.out.println(liter.next());
        Collections.reverse(l);
        liter = l.listIterator();
        System.out.println("\nReversed collection :");
        while (liter.hasNext())
            System.out.println(liter.next());
    }
}