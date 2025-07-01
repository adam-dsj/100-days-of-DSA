package Twosum;

import java.util.HashSet;
import java.util.Set;

class Solution {
	
    public int lengthOfLongestSubstring(String s) {
        int leftPointer = 0;
        int largestSubString = 0;
        Set<Character> mySet = new HashSet<>();
        for (int i = 0; i<s.length(); i++) {
            while (mySet.contains(s.charAt(i))) {
            mySet.remove(s.charAt(leftPointer));
            leftPointer += 1;
            }
            mySet.add(s.charAt(i));
            if (largestSubString < mySet.size()) {
                largestSubString = mySet.size();
            }
        } 
    return largestSubString;  
    }
}