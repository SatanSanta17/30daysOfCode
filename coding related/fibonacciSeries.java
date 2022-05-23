import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 0;
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        if (n > 2) {
            for (int i = 0; i < n - 2; i++) {
                number = a + b;
                a = b;
                b = number;
                System.out.print(number + " ");
            }
        }
    }
}