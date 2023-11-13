class Solution {
        public int longestSubarray(int[] nums) {
            int max = Integer.MIN_VALUE;
            int k = 0;
            int right = 0;
            int left = 0;


            while(right < nums.length ){
                if(nums[right] == 0) {
                    k++;
                }

                while (k > 1){
                    if(nums[left] == 0){
                        k--;
                    }
                    left++;
                }
                max = Math.max(max, right-left);
                right++;
            }
            return max;
        }
}