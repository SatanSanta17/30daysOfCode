
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String s = String.valueOf(x);
        int n = s.length();
        boolean isPalindrome = false;
        if (n % 2 == 0) {
            for (int i = 0; i < (n / 2) - 1; i++) {
                if (s.charAt(i) == s.charAt(n - 1 - i)) {
                    isPalindrome = true;
                } else
                    isPalindrome = false;
            }
        } else {
            for (int i = 0; i < n / 2; i++) {
                if (s.charAt(i) == s.charAt(n - 1 - i)) {
                    isPalindrome = true;
                } else
                    isPalindrome = false;
            }
        }
        if (isPalindrome) {
            System.out.println("is a Palindrome");
        } else {
            System.out.println("is not a  Palindrome");
        }

    }

}
