class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int max = Integer.MIN_VALUE;
        int temp = 0;
        int average = 0;

        if(k ==1) return Arrays.stream(nums).max().getAsInt();

        for(int q =0; q< k;q++){
            temp += nums[q];
        }

        if(temp > max) max = temp;
        
        for(int i =0; i+k< nums.length;i++){
            temp = temp - nums[i] + nums[i+k];
            if(temp > max) max = temp;
        }

        return (double)max / k;
    }
}