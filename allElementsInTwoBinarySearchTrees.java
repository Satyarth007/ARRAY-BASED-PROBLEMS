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
// using inorder traversal here
    public void inorder(TreeNode root,List<Integer> l){
        if(root==null) return;
        inorder(root.left,l);
        l.add(root.val);
        inorder(root.right,l);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l= new ArrayList<>();
        inorder(root1,l);
        inorder(root2,l);
        Collections.sort(l);
        return l;
        
    }
}
