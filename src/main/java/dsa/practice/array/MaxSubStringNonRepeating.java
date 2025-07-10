package dsa.practice.array;

import java.util.HashSet;
import java.util.Set;

public class MaxSubStringNonRepeating {
    public static void main(String[] args) {
        System.out.println(longestUniqueSubstr("adcbabca"));  // Output: "adcb"
        System.out.println(longestUniqueSubstr("abcabcbb"));  // Output: "abc"
        System.out.println(longestUniqueSubstr("bbbbb"));     // Output: "b"
        System.out.println(longestUniqueSubstr("pwwkew"));     // Output: "wke"
        System.out.println(longestUniqueSubstr(""));          // Output: ""
        System.out.println(longestUniqueSubstr("aab"));       // Output: "ab"
    }

    public static String longestUniqueSubstr(String str) {
        int start = 0;
        int end =0;
        int maxLen = 0;
        int maxStart = 0;
        Set<Character> seen = new HashSet<>();
        while(end < str.length()) {
            char c = str.charAt(end);
            while (seen.contains(c)){
                seen.remove(str.charAt(start));
                start++;
            }
            seen.add(c);

            if(maxLen < end-start+1) {
                maxLen = end-start+1;
                maxStart = start;
            }
            end++;
        }
        return str.substring(maxStart, maxStart + maxLen);
    }
}
