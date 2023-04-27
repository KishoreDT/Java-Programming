import java.util.*;
import java.io.*;

public class P4 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader (new
        InputStreamReader(System.in));
        System.out.println("Enter the number of elements:");
        int n = Integer.parseInt(in.readLine());
        String[] name = new String[n];
        System.out.println("\nEnter the elements: ");
        for(int i = 0; i < n; i++)
        {
            name[i] = in.readLine();
        }
        List<String> list = Arrays.asList(name);
        System.out.println();
        for(String li: list)
        {
            String str = li;
            System.out.print(str + " ");
        }
    }
}