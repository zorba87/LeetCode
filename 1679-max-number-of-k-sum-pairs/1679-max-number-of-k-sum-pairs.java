 class Solution {
        int num = 0;
        
        public int maxOperations(int[] nums, int k) {
            ArrayList<Integer> list = new ArrayList<>();

            for (int num : nums) {
                list.add(num);
            }
            Collections.sort(list);

            int left = 0;
            int right = list.size()-1;

            while(left < right){
               if(list.get(left) + list.get(right) < k) {
                   left++;
               } else if(list.get(left) + list.get(right) > k) {
                   right--;
               }
               else if(list.get(left) + list.get(right) == k) {
                   left++;
                   right--;
                   num++;
               }
            }
            return num;
        }
    }