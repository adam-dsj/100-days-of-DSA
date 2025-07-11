class Solution {
    public int findMin(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            int middle = 0;
            while (left < right) {
                middle = left + (right-left)/2;
                if (nums[middle] > nums[right]) {
                    left = middle + 1;
                }
                else { 
                    right = middle;
                }
            }
            return nums[left];  
    }
}