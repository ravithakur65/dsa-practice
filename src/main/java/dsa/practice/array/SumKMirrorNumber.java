package dsa.practice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SumKMirrorNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,3,4,5,6,3,4,7,6,3);
        Map<Integer, Integer> occuranceMap = new HashMap<>();
        for(int i=0; i<nums.size();i++){
            occuranceMap.compute(nums.get(i), (k,v) -> (v == null? 0: v)+1);
        }
    System.out.println(occuranceMap);
    }
}
