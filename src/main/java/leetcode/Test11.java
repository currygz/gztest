package leetcode;

import exe.ZtreeNode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        TreeNode root = new TreeNode(arr[0]);
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        tree(deque,root,arr);
        return;
    }


    public static void tree( ArrayDeque deque,TreeNode root,int[] arr ) {
        deque.push(root);
        TreeNode preNode = new TreeNode(-1);
        boolean fla = true;
        for (int i = 0; i < arr.length; i++) {

//            TreeNode node = deque.peekLast();
            TreeNode node = (TreeNode) deque.peekLast();
            TreeNode currNode = new TreeNode(arr[i]);
            while (!deque.isEmpty()&& ((TreeNode) deque.peekLast()).value< currNode.value){
                node = (TreeNode) deque.removeLast();
                if (!deque.isEmpty()) {

                    preNode = (TreeNode) deque.peekLast();
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

