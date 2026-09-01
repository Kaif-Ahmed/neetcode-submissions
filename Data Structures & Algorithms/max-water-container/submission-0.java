class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int height, width, currentArea, maxArea = 0;
        while (left < right){
            height = Math.min(heights[left], heights[right]);
            width = right - left;
            currentArea = height * width;
            maxArea = Math.max(maxArea, currentArea);
           if (heights[left] < heights[right]){
            left++;
           }
           else{
            right--;
           }
        }
        return maxArea;
    }
}
