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
    private int help(TreeNode root,int a){
        if(root==null) return 0;
        if(root.left==null && root.right==null) {
            a=a*10+root.val;
            return a;
        }

        a=a*10+root.val;

        int left=help(root.left,a);
        int right=help(root.right,a);

        return left+right;

    }
    public int sumNumbers(TreeNode root) {
        // int[] ans={0};

        int a=0;

        int ans=help(root,a);

        return ans;


    }
}