package tree;

import java.util.ArrayList;
import java.util.List;

// NOTE: This is the base class for each node in the Tree
class Node<T> {
  T data;
  Node<T> left, right;

  public Node(T data) {
    this.data = data;
    this.left = this.right = null;
  }
}

public class PreorderSearch<T> {

  public void walk(Node<T> node, List<T> path) {
    if (node == null)
      return;

    path.add(node.data); // Visit node
    walk(node.left, path); // Go left
    walk(node.right, path); // Go right
  }

  public void treeTraversal(T value) {
    Node<T> node = new Node<>(value);
    List<T> path = new ArrayList<>();
    walk(node, path);

    // Print the traversal path
    System.out.println("Preorder Traversal: " + path);
  }

  public static void main(String[] args) {
    PreorderSearch<Integer> tree = new PreorderSearch<>();
    tree.treeTraversal(10); // Example call
    tree.treeTraversal(20); // Example call
    tree.treeTraversal(30); // Example call
    tree.treeTraversal(40); // Example call
  }
}
