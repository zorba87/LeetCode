/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // found p or q or touch the ground
        if(root == null || root == p || root == q){
            return root;
        }
        // search p and q from left and right
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        
    // from root's left & right we found both p and q, so root is the LCA
        if (left != null && right != null)
          return root;
        else
          return left != null ? left : right;
    // left is not null means from left's left & right we found both q and q
    // so left is the LCA, otherwise, right is the answer
    }
}

/*
Sol2>> 

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<List<TreeNode>> listBig = new ArrayList<>();
        goDFS(root, p, q, new ArrayList<>(), listBig);
        List<TreeNode> one = listBig.get(0), two = listBig.get(1);
        for (int i = one.size() - 1; i >= 0; i--) {
            TreeNode node1 = one.get(i);
            for (int j = two.size() - 1; j >= 0; j--) {
                TreeNode node2 = two.get(j);
                if (node1.equals(node2)) return node1;
            }
        }
        return root;
    }

    private void goDFS(TreeNode node, TreeNode p, TreeNode q, List<TreeNode> list, List<List<TreeNode>> listBig) {
        if (node == null) return;
        
        list.add(node);
        if (node.val == p.val || node.val == q.val) listBig.add(new ArrayList<>(list));
        
        goDFS(node.left, p, q, list, listBig);
        goDFS(node.right, p, q, list, listBig);
        list.remove(list.size() - 1);
    }
}
*/