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

    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        
        if(root == null) return 0;
        
        pathSumHelper(root,0,targetSum);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        
        return count;
    }

    void pathSumHelper(TreeNode root, long accuSum, int targetSum){
        if(root == null ) return;

        accuSum += root.val;
        if(accuSum == targetSum ){
            count ++;
        } 
        pathSumHelper(root.left,accuSum,targetSum);
        pathSumHelper(root.right,accuSum,targetSum);
        // accuSum -= root.val;
        // if(accuSum == targetSum){
        //     count ++;
        //     return;
        // } 
    }
}