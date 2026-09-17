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
    private void help(TreeNode root,int targetSum,List<List<Integer>> ans,List<Integer> a){
        if(root==null) return;
        if(root.left==null && root.right==null){
            a.add(root.val);
            int sum=0;
            for(var x:a) sum+=x;

            if(sum==targetSum){
                ans.add(new ArrayList<Integer>(a));
            }
            a.removeLast();
            return;
        }

        a.add(root.val);

        help(root.left,targetSum,ans,a);
        help(root.right,targetSum,ans,a);

        a.removeLast();
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> a=new ArrayList<>();

        help(root,targetSum,ans,a);

        return ans;
    }
}