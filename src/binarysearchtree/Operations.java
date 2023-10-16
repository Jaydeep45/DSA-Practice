package binarysearchtree;

public class Operations {
    static BinarySearchNode root = null;
    public static void main(String[] args) {
        root = insert(root, 50);

        // inserting value 30
        insert(root, 30);

        // inserting value 20
        insert(root, 20);

        // inserting value 40
        insert(root, 40);

        // inserting value 70
        insert(root, 70);

        // inserting value 60
        insert(root, 60);

        // inserting value 80
        insert(root, 80);

        print(root);
    }

    private static void print(BinarySearchNode root) {
        if(root == null)
            return;
        print(root.left);
        System.out.println(root.data);
        print(root.right);
    }

    private static BinarySearchNode insert(BinarySearchNode node, int data) {
        if (node == null)
            return new BinarySearchNode(data);
        else if (node.data > data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }
        return node;

    }
}
