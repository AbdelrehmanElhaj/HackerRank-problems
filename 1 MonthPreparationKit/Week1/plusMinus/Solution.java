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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Functional programming using stream api
        long plusCount = arr.stream().filter(x -> x > 0).count();
        long minusCount = arr.stream().filter(x -> x < 0).count();
        long zeroCount = arr.stream().filter(x -> x == 0).count();
        
        System.out.printf("%.6f%n", (double) plusCount/arr.size());
        System.out.printf("%.6f%n", (double) minusCount/arr.size());
        System.out.printf("%.6f%n", (double) zeroCount/arr.size());
        
    /*
    // Imperative programming
        int plusCount = 0;
        int minusCount = 0;
        int zeroCount = 0;
        
        for(int el: arr) {
            if (el < 0) minusCount++;
            else if (el == 0) zeroCount++;
            else plusCount++;
        }
        
        int n = arr.size();
        
        double pRatio = (double) plusCount / n;
        System.out.printf("%.6f%n", pRatio);
        
        double mRatio = (double) minusCount / n;
        System.out.printf("%.6f%n", (mRatio));
        
        double zRatio = (double) zeroCount / n;
        System.out.printf("%.6f%n", zRatio);
        */

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

