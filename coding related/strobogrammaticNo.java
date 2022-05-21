import java.util.Scanner;

public class strobogrammaticNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isStrobogrammatic = false;
        int l = String.valueOf(number).length();
        int[] digits = new int[l];
        for (int i = 0; i < l; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }
        for (int i = 0; i < l; i++) {
            int a = digits[i];
            switch (a) {
                case 1:
                    digits[i] = 1;
                    break;
                case 6:
                    digits[i] = 9;
                    break;
                case 8:
                    digits[i] = 8;
                    break;
                case 9:
                    digits[i] = 6;
                    break;
                default:
                    isStrobogrammatic = false;
            }

        }
        if (isStrobogrammatic) {
            for (int e : digits) {
                System.out.print(e);
            }
        } else
            System.out.println("not a strobogrammatic number");

    }
}