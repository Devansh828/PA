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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level=0;

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> levelList = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode n = q.poll();
                levelList.add(n.val);

                if (n.left != null)
                    q.offer(n.left);
                if (n.right != null)
                    q.offer(n.right);

            }
            if(level%2==0){
                ans.add(levelList);
            }
            else{
                Collections.reverse(levelList);
                ans.add(levelList);
            }
            level++;

        }

        return ans;

    }
}