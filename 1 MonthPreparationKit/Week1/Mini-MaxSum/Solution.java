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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        long sum = arr.stream().mapToLong(i -> i).sum();
        
        int min = arr.stream()
             .mapToInt(i -> i)
             .min()
             .orElseThrow(() -> new NoSuchElementException("Empty List"));
        int max = arr.stream()
             .mapToInt(i -> i)
             .max()
             .orElseThrow(() -> new NoSuchElementException("Empty List"));
        
        // System.out.println("sum is:" + sum);
        // System.out.println("min is:" + min);
        // System.out.println("max is:" + max);
        System.out.println((sum - max) + " " + (sum - min));

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
