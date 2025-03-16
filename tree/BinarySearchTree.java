package tree;

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

  int[] walk(Node node, int[] path) {

    if (node == null)
      return null;

    walk(node.left, path);
    path
    walk(node.left, path);
  }

  int[] traversal(Node node, int[] path) {

    return new int[4];

  }
}
