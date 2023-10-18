//Re[ ]
    class Solution {
        public boolean isSubsequence(String s, String t) {
            int j = 0;
            int n = t.length();
            int m = s.length();
            char[] ss = s.toCharArray();
            char[] tt = t.toCharArray();

            if(m <1) return true;
            
            for(int i =0; i< n ; i++ ){
                if(tt[i] == ss[j]){
                    j++;
                }
            
                if(j== m) return true;
            }
            return false;
        }
    }