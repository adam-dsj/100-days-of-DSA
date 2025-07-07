class Solution {
    public int maxProfit(int[] prices) {
        int highestProfit = 0;
        for (int i = 0; i<prices.length; i++) {
            for (int j = i + 1; j<prices.length; j++) {
                if ((prices[j] - prices[i]) > highestProfit) {
                    highestProfit = prices[j] - prices[i];
                }
            }
        }
        return highestProfit;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0;
        int r = 1;
        while (r <= prices.length -1 ) {
            if (prices[r] < prices[l]) {
                l = r;
            }
            if (prices[r] - prices[l] > maxProfit) {
                maxProfit = prices[r] - prices[l];
            }
            r++;
        }
        return maxProfit;
    }
}