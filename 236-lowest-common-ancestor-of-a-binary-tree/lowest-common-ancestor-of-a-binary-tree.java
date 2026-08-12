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
        if(root==null) return null;
        if(root==p || root==q) return root; //because the parent can be own descenadant

        TreeNode left=lowestCommonAncestor(root.left,p,q); //searxh in left
        TreeNode right=lowestCommonAncestor(root.right,p,q); //search in right

        if(left!=null && right!=null){ //if one found in left and another in right then root is ans
            return root;
        }

        if(left!=null) return left; //if both are found in left then left is ans

        return right; //same for right as left
    }
}