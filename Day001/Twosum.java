package Twosum;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        for (int i = 0; i<nums.length; i++) {
            int complement = target - nums[i];
            if (myHashMap.containsKey(complement)) {
                return new int[]{myHashMap.get(complement), i};
            }
            myHashMap.put(nums[i], i);
        }
    throw new IllegalArgumentException("No two sum solution");
    }
    
}