package EH;
import java.util.*;

class P2 {
    public static void main(String[] args) {
        hexToDecimal();
    }
    public static boolean check(String str) {
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char w = str.charAt(i);
            if (w=='A'||w=='B'||w=='C'||w=='D'||w=='E'||w=='F'||w=='1'||w=='2'||w=='3'||w=='4'||w=='5'||w=='6'||w=='7'||w=='8'||w=='9') {
                continue;
            }
            else {
                return false;
            }
        }
    return true;
    }
    public static void hexToDecimal() {
        String str;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter string :");
            str=sc.nextLine();
        }
        try {
            if (!check(str)) {
                throw new NumberFormatException();
            }
            Integer dec = Integer.parseInt(str,16);
            System.out.println(dec);
        }
        catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
