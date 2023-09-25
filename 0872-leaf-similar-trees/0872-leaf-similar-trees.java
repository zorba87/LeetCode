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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList();
        List<Integer> leaves2 = new ArrayList(); 
        
        dfs(root1,leaves1);
        dfs(root2,leaves2);
        
        return leaves1.equals(leaves2);
    }


    void dfs(TreeNode root , List<Integer> leafValues){
        if(root != null){
            if(root.left == null && root.right == null){
                leafValues.add(root.val);
            }
            dfs(root.left,leafValues);
            dfs(root.right,leafValues);
        }
    }
}