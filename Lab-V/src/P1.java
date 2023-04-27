import java.io.*;
import java.util.Arrays;
import java.util.List;

public class P1 {
    public static void main(String[] args) throws Exception
    {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        String[] n = new String[5];
        int i = 0;
        System.out.println("Enter the strings: ");
        while (i < n.length)
        {
            n[i] = br.readLine();
            i++;
        }
        br.close();
        r.close();
        List<String> list = Arrays.asList(n);
        list.toArray(n);
        System.out.println("\nStrings are :\n");
        for (String str : list)
        System.out.println(str);
    }
}