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
import java.util.*;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
       Queue<TreeNode> q = new LinkedList<>();

        if(root == null){
            return new ArrayList<>();
        }
        q.add(root);
        List<Integer> list = new ArrayList<>();

        while(!q.isEmpty()){

            int size = q.size();
            
            for(int i =0; i< size ; i++){
                TreeNode node = q.poll();
                
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
                if(i == size -1 ){
                    list.add(node.val);
                }
            }

        }

        return list;
    }
}







// public List<Integer> rightSideView(TreeNode root) {
//         Queue<TreeNode> q= new ArrayDeque<>();
//         List<Integer> res = new ArrayList<>();
//         if(root == null) return res;
//         q.offer(root);
//         while(!q.isEmpty()){
//             int size = q.size();
//             for(int i = 0; i< size; i++){
//                 TreeNode node = q.poll();
//                 if(i == size-1) res.add(node.val);
//                 if(node.left != null) q.offer(node.left);
//                 if(node.right != null) q.offer(node.right);
//             }
//         }
//         return res;
//     }