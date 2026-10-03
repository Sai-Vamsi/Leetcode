class Solution {
    int max = 0;
    int l = 0;

    public String longestPalindrome(String s) {
        char[] input = s.toCharArray();
        if(s.length() < 2) {
            return s;
        }
        for(int i = 0; i < input.length; i++) {
            expandPalin(input, i, i);       // Checks for odd-length palindromes
            expandPalin(input, i, i + 1);   // Checks for even-length palindromes
        }
        return s.substring(l, l + max);
    }

    public void expandPalin(char[] s, int j, int k) {
        while(j >= 0 && k < s.length && s[j] == s[k]) {
            j--;
            k++;
        }
        if(max < k - j - 1) {
            max = k - j - 1;
            l = j + 1;
        }
    }
}
