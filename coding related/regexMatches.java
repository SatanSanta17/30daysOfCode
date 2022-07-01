import java.io.*;
import java.util.*;
import java.util.regex.*;

public class regexMatches {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();
            // String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]$";
            String regularExpression = "^[aA-zZ]\\w{7,29}$";
            if (Pattern.matches(regularExpression, userName)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
