import java.io.*;
import java.util.*;

public class tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String s1 = s.trim();
        if (s1.length() > 0) {
            String[] split = s1.split("[^a-zA-Z]+");
            System.out.println(split.length);
            for (String e : split) {
                System.out.println(e);
            }
        } else {
            System.out.println(0);
        }
        scan.close();
    }
}
