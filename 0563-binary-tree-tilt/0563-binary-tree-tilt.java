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
    private int sum=0;
    private int help(TreeNode root){
        if(root==null) return 0;
        // if(root.left==null && root.right==null){
        //     return ;
        // }

        int left=help(root.left);
        int right=help(root.right);

        sum+=Math.abs(left-right);

        return left + right + root.val;
    }

    public int findTilt(TreeNode root) {
        help(root);
        return sum;
    }
}