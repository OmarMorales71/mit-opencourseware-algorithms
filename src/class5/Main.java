package class5;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();


        System.out.println(tree.insert(49, 2));
        System.out.println(tree.insert(50, 3));
        System.out.println(tree.insert(65, 3));
        System.out.println(tree.insert(40, 4));
        System.out.println(tree.insert(45, 1));
        System.out.println(tree.insert(44, 3));
        inOrder(tree.root);
    }

    public static void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }
}
