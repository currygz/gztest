package leetcode;

import java.util.ArrayDeque;
import java.util.*;

public class EWe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        TreeNode root = new TreeNode(arr[0]);
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();

        deque.push(root);
        TreeNode preNode = new TreeNode(-1);
        boolean fla = true;
        for (int i = 0; i < arr.length; i++) {

            TreeNode node = deque.peekLast();
            TreeNode currNode = new TreeNode(arr[i]);
            while (!deque.isEmpty()&&deque.peekLast().value< currNode.value){
                node = deque.removeLast();
                if (!deque.isEmpty()) {

                    preNode = deque.peekLast();
                }
            }

            if (node.value<currNode.value){
                node.right = currNode;
                preNode = node;

            }else {
                if (currNode.value< preNode.value){
                    fla = false;
                    break;
                }

                node.left = currNode;
            }

            deque.addLast(currNode);
        }

        if (fla){
            TreeNode leftNode = root;
            while (leftNode.left!=null || leftNode.right != null){
                if (leftNode.left != null){
                    leftNode = leftNode.left;
                }else {
                    leftNode = leftNode.right;
                }
            }
            TreeNode rightNode = root;
            while (rightNode.left != null||rightNode.right!=null){
                if (rightNode.right != null){
                    rightNode = rightNode.right;
                }else {
                    rightNode = rightNode.left;
                }
            }


            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(1).append(" ")
                    .append(leftNode.value == root.value?0 : leftNode.value).append(" ")
                    .append(rightNode.value== root.value?0:rightNode.value);
            System.out.println(stringBuilder);
        }
        else {
            System.out.println("0 0 0");
        }
        return;
    }

    static class TreeNode{
        private int value;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }
}
