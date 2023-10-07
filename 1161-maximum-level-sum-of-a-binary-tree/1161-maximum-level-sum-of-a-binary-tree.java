/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        int level = 1;
        int lvcnt = 1;

        q.offer(root);
    
        while(!q.isEmpty()){
            
            int size = q.size();
            
            List<Integer> ll = new ArrayList<>();
            ll.add(0);
            
            for(int i=0; i < size; i++){
                TreeNode node = q.poll();
                // list.get(level-1).add(new ArrayList<>());
                int val = ll.get(0);
                val += node.val;
                ll.set(0,val);
                
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
            }
            list.add(ll);
            level++;
        }

        int max = Integer.MIN_VALUE;
        int result = 1;
        for(int i = 0; i < list.size() ; i++ ){
            int val = list.get(i).get(0);
            if(val > max){
                result = i; 
                max = val;
            } 
            // System.out.println(val);
        }

        return result+1;   
    }
}