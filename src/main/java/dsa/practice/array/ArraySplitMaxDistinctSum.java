package dsa.practice.array;

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


public class ArraySplitMaxDistinctSum {
    /*
     * Complete the 'getMaxSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int getMaxSum(List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] leftDistinct = new int[n];
        int[] rightDistinct = new int[n];

        Set<Integer> visited = new HashSet<>();

        for (int i = 0; i < n; i++) {
            visited.add(arr.get(i));
            leftDistinct[i] = visited.size();
        }

        visited.clear();

        for (int i = n - 1; i >= 0; i--) {
            visited.add(arr.get(i));
            rightDistinct[i] = visited.size();
        }

        int maxSum = 0;

        for (int i = 1; i < n; i++) {
            int sum = leftDistinct[i - 1] + rightDistinct[i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;

    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = ArraySplitMaxDistinctSum.getMaxSum(arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
            System.out.println(result);
        bufferedReader.close();
//        bufferedWriter.close();
    }
}
