
// first Attempt, it passed almost all cases, but failed at some really nich edge cases. 
// Online suggested to use dynamic programming, so I'm using that below:


class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>();
        for (String word : wordDict) {
            dict.add(word);
        }
        int letterCount = 0;
        int l = 0;
        int r = 0;
        while (r < s.length()) {
            if (dict.contains(s.substring(l, r+1))) {
                letterCount += r-l+1;
                l = r+1;
            }
        r++;
        }
        if (s.length() == letterCount) {
            return true;
        }
        else {
            return false;
        }
    }
}

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);

        int maxWordLen = 0;
        for (String word : wordDict) {
            maxWordLen = Math.max(maxWordLen, word.length());
        }

        int n = s.length();
        boolean[] dp = new boolean[n+1]; // the +1 is for the 0 index

        dp[0] = true;

        for (int i = 1; i<=n; i++) {
            for (int j = 0; j < i; j++) {
                String word = s.substring(j, i);
                if (dp[j] && wordSet.contains(word)) {
                    dp[i] = true;
                    break;
                }
           }
        }

        return dp[n];
    }
}