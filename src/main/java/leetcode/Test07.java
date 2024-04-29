package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Test07 {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        test(root,res);
        return res;
    }

    public void test(TreeNode node,List<Integer> list){
        if (node == null){
            return;
        }
        list.add(node.val);
        test(node.left,list);
        test(node.right,list);
    }
}
