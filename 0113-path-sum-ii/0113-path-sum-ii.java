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
    private void help(TreeNode root,int targetSum,List<List<Integer>> ans,List<Integer> a,int sum){
        if(root==null) return;
        if(root.left==null && root.right==null){
            a.add(root.val);
            // int sum=0;
            // for(var x:a) sum+=x;
            sum+=root.val;
            if(sum==targetSum){
                ans.add(new ArrayList<Integer>(a));
            }
            a.removeLast();
            return;
        }

        a.add(root.val);
        sum+=root.val;

        help(root.left,targetSum,ans,a,sum);
        help(root.right,targetSum,ans,a,sum);

        a.removeLast();
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        int sum=0;
        help(root,targetSum,ans,a,sum);

        return ans;
    }
}