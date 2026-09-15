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

    private void help(TreeNode root, StringBuilder sc, List<String> ans) {
        if (root == null)
            return;

        int len = sc.length(); // save current state

        if (root.left == null && root.right == null) {
            sc.append(root.val);
            ans.add(sc.toString());
            sc.setLength(len); // backtrack
            return;
        }

        sc.append(root.val).append("->");

        help(root.left, sc, ans);
        help(root.right, sc, ans);

        sc.setLength(len); // restore state

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        StringBuilder sc = new StringBuilder();
        help(root, sc, ans);
        return ans;
    }
}