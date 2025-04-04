
import java.util.ArrayList;

class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    Node search(int value) {
        return findRec(root, value);
    }

    Node findRec(Node root, int value) {

        if (root == null)
            return null;

        if (root.value == value)
            return root;

        if (root.value > value)

            return findRec(root.left, value);
        return findRec(root.right, value);
    }

    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        }

        if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;

    }

    // NOTE : This is for the pre Order traversal which is for adding element before
    // recurrsion

    ArrayList<Integer> walkpre(Node node, ArrayList<Integer> path) {

        if (node == null)
            return null;

        path.add(node.value);
        walk(node.left, path);
        walk(node.right, path);
        return path;
    }

    ArrayList<Integer> preOrderTraversal(Node node, ArrayList<Integer> path) {

        return walkpre(node, path);

    }

    // NOTE : This is for the pre Order traversal which is for adding element After
    // recurrsion
    ArrayList<Integer> walkPost(Node node, ArrayList<Integer> path) {

        if (node == null)
            return null;

        walk(node.left, path);
        walk(node.right, path);
        path.add(node.value);
        return path;
    }

    ArrayList<Integer> postOrderTraversal(Node node, ArrayList<Integer> path) {

        return walkPost(node, path);

    }

    // NOTE : This is for the pre Order traversal which is for adding element
    // between recurrsion like after left andf before right

    ArrayList<Integer> walk(Node node, ArrayList<Integer> path) {

        if (node == null)
            return null;

        walk(node.left, path);
        path.add(node.value);
        walk(node.right, path);
        return path;
    }

    ArrayList<Integer> inOrderTraversal(Node node, ArrayList<Integer> path) {

        return walk(node, path);

    }

}
