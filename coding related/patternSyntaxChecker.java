import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class patternSyntaxChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = Integer.parseInt(sc.nextLine());
        int n = sc.nextInt();
        sc.nextLine();
        // int n=4;
        while (n > 0) {
            String s = sc.nextLine();
            try {
                Pattern p = Pattern.compile(s);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
                // System.out.println(e.getMessage());
            }
            n--;
        }
        sc.close();
    }
}
