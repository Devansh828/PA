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

    public Boolean help(TreeNode root){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            if(root.val==0) return false;
            else return true;
        }
        Boolean left=help(root.left);
        Boolean right= help(root.right);

        if(left==false){
            root.left=null;
        }
        if(right==false){
            root.right=null;
        }

        return left || right || root.val==1;
    }

    public TreeNode pruneTree(TreeNode root) {
        help(root);
        if(root.left==null && root.right==null && root.val==0) return null;
        return root;
    }
}