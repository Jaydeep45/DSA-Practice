package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeOperations {
    static BinaryTree root = null;
    public static void main(String[] args) {
        root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.right = new BinaryTree(3);
        root.left.left = new BinaryTree(4);
        root.left.right = new BinaryTree(5);

        preOrder(root);

        levelOrder(root);
    }

    private static void levelOrder(BinaryTree treeNode) {
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(treeNode);
        while (!queue.isEmpty()) {
            BinaryTree node = queue.remove();
            System.out.print(node.data + " ");
            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }
    }

    private static void preOrder(BinaryTree treeNode) {
        if(treeNode == null)
            return;
        preOrder(treeNode.left);
        System.out.println(treeNode.data);
        preOrder(treeNode.right);
    }

}
