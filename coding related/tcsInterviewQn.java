import java.util.Scanner;

public class tcsInterviewQn {
    public static int findIndex(String arr[], String t) {

        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (t.equals(arr[i])) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stops[] = { "TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA" };
        String departure = sc.nextLine();
        String destination = sc.nextLine();
        int departidx = findIndex(stops, departure);
        int destiidx = findIndex(stops, destination);
        int dist[] = { 0, 800, 600, 750, 900, 1400, 1200, 1100, 1500 };
        int cd[] = new int[9];
        for (int i = 1; i < 9; i++) {
            cd[i] = dist[i] + cd[i - 1];
        }
        if (destiidx > departidx) {
            System.out.println(cd[destiidx] - cd[departidx]);
            System.out.println(Math.ceil(5 * (cd[destiidx] - cd[departidx]) / 1000.0));
        } else {
            int distTravelled = 8250 - (cd[departidx] - cd[destiidx]);
            System.out.println(distTravelled);
            System.out.println(Math.ceil(5 * distTravelled / 1000.0));
        }

    }

}