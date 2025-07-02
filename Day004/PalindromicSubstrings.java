
class Solution {
    public int countSubstrings(String s) {
        int resultLength = 0;
        // for odd numbered palindromes
        for (int i = 0; i<s.length(); i++) {
            int l = i;
            int r = i;
            while (l>= 0 && r <s.length() && s.charAt(l) == s.charAt(r)) {
                resultLength += 1;
                l -= 1;
                r += 1;
            }
            l = i;
            r = i+1;
            // for even numbered palindromes
            while (l>= 0 && r <s.length() && s.charAt(l) == s.charAt(r)) {
                if (s.charAt(l) == s.charAt(r)) {
                    resultLength += 1;
                }
                l -= 1;
                r += 1;            
             }
              
        }
    return resultLength;  
    }
}