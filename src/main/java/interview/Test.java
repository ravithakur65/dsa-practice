package interview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
       /*
       Input: Start = [1, 0, 3, 5, 8, 5] End = [2, 6, 4, 7, 9, 9]	Output: 4
        Explanation: The jobs that can be scheduled are: (1,2), (3,4), (5,7), and (8,9).
        [3, 0, 1, 5, 8, 5]
        [4, 6, 2, 7, 9, 9]

        (1,2)-> 1
        (3,4) - 1
        (8,9) -> 1
        (5,7) -> 2
        (5,9) -> 4
        (0,6) -> 7


        (1,2), (3,4), (5,7), and (8,9)

        */


        int[] nums = {1,2,3,4,5};
        Map<Integer, Integer> result = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toMap(Function.identity(), num -> num * 10));
        int[] start = {3, 0, 1, 5, 8, 5};
        int[] end = {4, 6, 2, 7, 9, 9};
        int[] intervals = new int[2];
//        Arrays.sort(start);
        for(int i=0; i< start.length-1;i++){
            int startTemp = start[i];
            int endTemp = end[i];
            if(endTemp >= start[i+1]) {
                intervals[0] = startTemp;
                intervals[1] = end[i+1];
            }
        }
    }
}
