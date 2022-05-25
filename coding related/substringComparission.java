import java.util.Scanner;

public class substringComparission {
    public static String getSmallestAndLargest(String s, int k) {
        // Lexicographically ordered substrings largest and smallest//

        int l = s.length();
        int n = l - k + 1;
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for (int i = 0; i < n; i++) {
            String w = s.substring(i, i + k);

            if (w.compareTo(largest) > 0) {
                largest = w;
            }
        }
        for (int i = 0; i < n; i++) {
            String w = s.substring(i, i + k);

            if (w.compareTo(smallest) < 0) {
                smallest = w;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));

    }
}
