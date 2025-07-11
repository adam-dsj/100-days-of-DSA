class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = -1;
        while (left <= right) {
            middle = left + (right - left)/2;
            // first we want to see if it's the middle element:
             if (nums[middle] == target) {
                return middle;
             }
             // lets check first if left half is sorted
             if (nums[left] <= nums[middle]) {
                // now that we know it's sorted on left side, we can check if the target
                // is inside the left side:
                if (nums[middle] > target && nums[left] <= target) {
                    // target lives within left side
                    right = middle-1;
                }
                else {
                    // target lives in right side;
                    left = middle+1;
                }
             }
             // since left half isnt sorted then we know the right half must be sorted
             else {
                if (nums[middle] < target && target <= nums[right]) {
                    left = middle + 1;
                } else {
                    right = middle -1;
                }

             }


        }

    return -1;

    }
}