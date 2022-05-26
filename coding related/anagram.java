import java.io.*;
import java.util.*;

public class anagram {
    static boolean isAnagram(String x, String y) {
        // Complete the function
        boolean isAnagram = true;
        // String [] c1=a.split("");
        // String [] c2=b.split("");
        // ArrayList<String> charList1=new ArrayList<String>(Arrays.asList(c1));
        // ArrayList<String> charList2=new ArrayList<String>(Arrays.asList(c2));
        int n = x.length();
        String a = x.toLowerCase();
        String b = y.toLowerCase();
        char c1[] = a.toCharArray();
        char c2[] = b.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        if (a.length() != b.length()) {
            isAnagram = false;
        } else {
            for (int i = 0; i < n; i++) {
                if (c1[i] != c2[i]) {
                    isAnagram = false;
                }
            }
        }
        return isAnagram;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
        // System.out.println(ret);
    }
}
