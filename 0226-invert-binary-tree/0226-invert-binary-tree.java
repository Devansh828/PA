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
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();
            // List<TreeNode> level=new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode n=q.poll();
                TreeNode left=n.left;
                TreeNode right=n.right;

                TreeNode temp=left;
                n.left=n.right;
                n.right=temp;


                // level.add(n);

                if(n.left!=null) q.offer(n.left);
                if(n.right!=null) q.offer(n.right);

            }

            // for(int i=0;i<level.size()/2;i++){
            //     int index=level.size()-1-i;
            //     TreeNode n1=level.get(i);
            //     TreeNode n2=level.get(index);

            //     int temp=n1.val;
            //     n1.val=n2.val;
            //     n2.val=temp;

            // }
        }

        return root;

    }
}