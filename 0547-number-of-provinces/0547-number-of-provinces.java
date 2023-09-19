    class Solution {
       

        public int findCircleNum(int[][] isConnected) {
            int count =0;
            int[] visited = new int[isConnected.length];

            for (int i = 0; i < isConnected.length; i++) {
                if(visited[i] == 0){
                    count++;
                    dfs(isConnected, visited,i);
                }
            }

            return count;

        }
    

        void dfs(int[][] isConnected,  int[] visited, int row) {

            for (int j = 0; j < isConnected[row].length; j++) {
                if (visited[j] == 0 && isConnected[row][j] == 1 ) {
                    visited[j] = 1;
                    dfs(isConnected,visited,j);
                }
            }

        }
    }