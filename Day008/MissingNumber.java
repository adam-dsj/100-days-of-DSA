class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i<nums.length; i++) {
            numSet.add(nums[i]);
        }
        int highestNumber = 0;
        for (int num : nums) {
            if (num > highestNumber) {
                highestNumber = num;
            }
        }
        for (int j = 0; j<highestNumber; j++) {
            if (!numSet.contains(j)) {
                return j;
            }
        }
    return highestNumber + 1;
    }
}