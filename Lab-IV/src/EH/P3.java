package EH;
import java.io.*;

public class P3 {
    public static void main(String[] args) {
        printName();
    }
    private static void printName() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter your Name :");
            String str = in.readLine();
            System.out.println("\nHello "+str);
        } catch (IOException e) {
        }
    }
}
