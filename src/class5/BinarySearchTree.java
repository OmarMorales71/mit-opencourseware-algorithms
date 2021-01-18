package class5;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public boolean insert(int value, int constraint) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return true;
        }
        Node currentNode = root;
        while (currentNode != null) {
            if(Math.abs(currentNode.value-value)<=constraint){
                return false;
            }
            if (value <= currentNode.value) {
                if (currentNode.left == null) {
                    currentNode.left = node;
                    return true;
                } else {
                    currentNode = currentNode.left;
                }
            } else {
                if (currentNode.right == null) {
                    currentNode.right = node;
                    return true;
                } else {
                    currentNode = currentNode.right;
                }
            }
        }
        return false;
    }


}

class Node {
    int value;
    Node left;
    Node right;
    int subtreeLength;

    public Node(int value) {
        this.value = value;
        subtreeLength = 1;
    }
}