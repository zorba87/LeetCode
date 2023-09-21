 class Solution {
    public int minReorder(int n, int[][] connections) {

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            list.add(new ArrayList<>());
        }

        for (int[] val: connections) {
            list.get(val[0]).add(val[1]);
            list.get(val[1]).add(val[0]*-1);
        }

        return dfs(list, new boolean[n],0);
    }
    int dfs(List<List<Integer>> list, boolean[] visit, int from) {

        int count = 0;

        visit[from] = true;

        for (Integer val: list.get(from)) {
            if (!visit[Math.abs(val)]) {
                count += dfs(list, visit,Math.abs(val)) + ((val > 0) ? 1 : 0);
            }
        }
        return count;

    }
}