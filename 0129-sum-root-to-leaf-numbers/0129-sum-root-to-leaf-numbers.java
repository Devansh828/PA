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
    private void help(TreeNode root,int[] ans,int a){
        if(root==null) return;
        if(root.left==null && root.right==null) {
            a=a*10+root.val;
            ans[0]=ans[0]+a;
            return;
        }

        a=a*10+root.val;

        help(root.left,ans,a);
        help(root.right,ans,a);



    }
    public int sumNumbers(TreeNode root) {
        int[] ans={0};

        int a=0;

        help(root,ans,a);

        return ans[0];


    }
}