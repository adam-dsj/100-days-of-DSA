class Solution {
    public int maxArea(int[] height) {
        int right = height.length -1;
        int left = 0;
        int maxWater = 0;
        while (right > left) {
            int width = right-left;
            int indexHeight = Math.min(height[left], height[right]);
            if (width*indexHeight > maxWater) {
                maxWater = width*indexHeight;
                }
            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
    return maxWater;
     }

}
