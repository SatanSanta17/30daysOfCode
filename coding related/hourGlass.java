import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        int x = arr.size();

        List<Integer> sum = new ArrayList<>();
        int t = 0;
        for (int m = 0; m < x - 2; m++) {
            for (int n = 0; n < x - 2; n++) {
                List<List<Integer>> a = new ArrayList<>();
                int maxSum = 0;
                for (int i = m; i < 3 + m; i++) {
                    a.add(new ArrayList<Integer>());
                    for (int j = n; j < 3 + n; j++) {
                        // a.add(i, new ArrayList<>(Arrays.asList(arr.get(i).get(j))));
                        a.get(i - m).add(j - n, arr.get(i).get(j));
                    }
                }
                for (int i = 0; i < 3; i++) {
                    maxSum += a.get(0).get(i);
                    maxSum += a.get(2).get(i);
                }
                maxSum += a.get(1).get(1);
                sum.add(maxSum);
            }
        }
        int max = sum.get(0);
        for (int i = 1; i < 16; i++) {
            if (sum.get(i) > max) {
                max = sum.get(i);
            }
        }
        return max;
    }
}

public class hourGlass {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
