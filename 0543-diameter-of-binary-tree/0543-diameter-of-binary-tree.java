class Solution {

    int ans = 0;

    int height(TreeNode root) {
        if(root == null) return 0;

        int a = height(root.left);
        int b = height(root.right);

        ans = Math.max(ans, a + b);

        return 1 + Math.max(a, b);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return ans;
    }
}