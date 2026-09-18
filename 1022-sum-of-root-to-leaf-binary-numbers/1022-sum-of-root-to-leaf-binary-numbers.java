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
    // int help1(long a){
    //     int ans=0;
    //     int mul=1;
    //     while(a!=0){
    //         ans+=(mul*(a%10));
    //         mul*=2;
    //         a/=10;
    //     }
    //     return ans;
    // }

    int help2(TreeNode root,int a){
        if(root==null) return 0;
        // a=a*10+root.val;
        a=a*2+root.val;
        if(root.left==null && root.right==null){
            return a;
        }

        int left=help2(root.left,a);
        int right=help2(root.right,a);

        return left+right;
    }
    public int sumRootToLeaf(TreeNode root) {

        return help2(root,0);
        
    }
}