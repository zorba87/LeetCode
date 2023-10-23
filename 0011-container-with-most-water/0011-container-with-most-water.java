 class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;

        int left = 0;
        int right = height.length-1;

        while(left < right){
            int w = right - left;
            int h = Math.min(height[right] , height[left]);
            int area = w * h;

            if(area > max) max = area;

            if(height[left] > height[right]){
                right--;
            } else if(height[left] < height[right]){
                left++;
            } else {
                left++;
                right--;
            }
        }

        return max;
    }
 }