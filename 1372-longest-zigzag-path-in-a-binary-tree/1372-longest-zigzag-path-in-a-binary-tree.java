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
// class Solution {
//     int count = 0 ;
//     int max = Integer.MIN_VALUE;
    
//     public int longestZigZag(TreeNode root) {
//         if(root == null) return 0; 
        
//         // direction
//         // -1 > left
//         // 1 > right
//         dfs(root,1,0);
//         dfs(root,-1,0);

//         longestZigZag(root.left);
//         longestZigZag(root.right);
        
//         return max-1;
//     }

//     void dfs(TreeNode root, int preDirection,int accCount){
//         accCount++;
//         if(root == null) return ;

//         if(preDirection > 0){
//             dfs(root.left,-1,accCount);
//             max = Math.max(accCount, max);
//         } 
//         else if(preDirection < 0){
//             dfs(root.right,1,accCount);
//             max = Math.max(accCount, max);
//         } 
//         return;
//     }
    
// }
class Solution {
    int count = 0 ;
    int max = Integer.MIN_VALUE;
    
    public int longestZigZag(TreeNode root) {
        
        // direction
        // -1 = left
        //  1 = right
        dfs(root,1,0);
        dfs(root,-1,0);

        // 이렇게하니까 timeout남
        // longestZigZag(root.left);
        // longestZigZag(root.right);
        
        return max;
    }

    void dfs(TreeNode root, int preDirection,int accCount){
        if(root == null) return ;
        max = Math.max(accCount, max);

        if(preDirection > 0){
            dfs(root.left,-1,accCount+1);
            dfs(root.right,1,1);
        } 
        else if(preDirection < 0){
            dfs(root.right,1,accCount+1);
            dfs(root.left,-1,1);
        } 
        return;
    }
    
}