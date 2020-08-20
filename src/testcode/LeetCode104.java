package testcode;

/**
 * 求二叉树的最大深度
 */
public class LeetCode104 {
    public static void main(String[] args) {
        Solution1 solution1= new Solution1();
    }
}

class Solution1 {
    private int count=0;
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 1;
        }
        return Math.max(maxDepth(root.left) , maxDepth(root.right));
    }
}

  class TreeNode {
     int val;TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }