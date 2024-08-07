// package PreOrderTraversal;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;
    BinaryTree() {
        root = null;
    }

    void printPreorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    void printInorder(Node node)
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
    void printPostorder(Node node)
    {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(8);
        tree.root.right.right = new Node(7);
        tree.root.right.left = new Node(6);
        tree.root.right.right.left = new Node(9);
        tree.root.right.right.right = new Node(10);

        System.out.println("Preorder traversal of binary tree is: ");
        tree.printPreorder(tree.root);
        System.out.println("\n");
        System.out.println("Inorder traversal of binary tree is: ");
        tree.printInorder(tree.root);
        System.out.println("\n");
        System.out.println("Postorder traversal of binary tree is: ");
        tree.printPostorder(tree.root);
    }
}
