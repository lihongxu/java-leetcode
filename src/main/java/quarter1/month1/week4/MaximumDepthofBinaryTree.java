package quarter1.month1.week4;


/**
 * User: lihongxu
 * Date: 18/1/22
 * Time: 11:43
 * Comments https://leetcode.com/problems/maximum-depth-of-binary-tree
 */
public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {

        int left = 0;
        int right = 0;
        if(root == null){
            return 0;
        }
        if(root.left !=null){
            left = maxDepth(root.left);
        }
        if(root.right != null){
            right = maxDepth(root.right);
        }
        if(left >= right){
            return left + 1;
        }
        else{
            return right + 1;
        }
    }

    // recursion method
    public int maxDepth2(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}


class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}


