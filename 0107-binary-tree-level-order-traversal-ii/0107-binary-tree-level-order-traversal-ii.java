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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        // Queue<List<Integer>> ans=new LinkedList<>();

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level=new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode n=q.poll();
                level.add(n.val);

                if(n.left!=null) q.offer(n.left);
                if(n.right!=null) q.offer(n.right);
            }

            ans.add(level);
        }

        // while(!ans.isEmpty()){
        //     a.add(ans.poll());
        // }

        Collections.reverse(ans);

        // System.out.println(ans);

        return ans;


        

    }
}