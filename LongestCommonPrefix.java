/**
 * Problem: Longest Common Prefix
 * Link: https://leetcode.com/problems/longest-common-prefix/
 * 
 * Description:
 * Find the longest common prefix string amongst an array of strings. 
 * If there is no common prefix, return an empty string.
 * 
 * Explanation:
 * The solution sorts the array of strings lexicographically. After sorting, 
 * it compares only the first and last strings in the array, as they will have 
 * the most differing characters. The common characters at the beginning of 
 * these two strings represent the longest common prefix for the entire array.
 */
import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int index = 0;
        
        while (index < s1.length() && index < s2.length()) {
            if (s1.charAt(index) == s2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return s1.substring(0, index);
    }
}
