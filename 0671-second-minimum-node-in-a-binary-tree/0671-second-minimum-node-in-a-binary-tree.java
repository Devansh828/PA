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
    int ans=-1;
    boolean inside=false;
    void help(TreeNode root , int n){
        if(root==null) return;

        if(root.val==Integer.MAX_VALUE) inside=true;

        if(root.val<n){
            ans=n;
            n=root.val;
        }
        else if(root.val<ans && root.val!=n){
            ans=root.val;
        }

        help(root.left,n);
        help(root.right,n);
    }
    public int findSecondMinimumValue(TreeNode root) {

        if(root==null) return -1;
        help(root,Integer.MAX_VALUE);
        if(ans==Integer.MAX_VALUE && !inside) return -1;
        return ans;
    }
}