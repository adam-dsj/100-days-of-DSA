class Solution {
    public int maxProduct(int[] nums) {
        int largestProduct = -100000000;
        int productSum = 1;

        for (int z = 0; z<nums.length; z++) {
            if (largestProduct == -100000000) {
                largestProduct = nums[z];
            }
            if (nums[z] > largestProduct) {
                largestProduct = nums[z];
            }
        }

        for (int i = 0; i<nums.length; i++) {
            productSum *= nums[i];
            if (productSum > largestProduct) {
                largestProduct = productSum;
            }
            if (nums[i] == 0) {
                productSum = 1;
            }
        }
        productSum = 1;
        for (int j = nums.length-1; j>0; j--) {
            productSum *= nums[j];
            if (productSum > largestProduct) {
                largestProduct = productSum;
            }
            if (nums[j] == 0) {
                productSum = 1;
            }
        }        
    return largestProduct;   
    }
}