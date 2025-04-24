class Node<T> {
  private T val;
  private Node<T> prev;

  public Node(T data) {
    this.val = data;
    this.prev = null;
  }

  public T getVal() {
    return this.val;
  }

  public Node<T> getPrev() {
    return this.prev;
  }

  public void setPrev(Node<T> data) {
    this.prev = data;
  }
}

public class Stack<T> {

  Node<T> top;

  public Stack() {
    top = null;
  }

  public T push(T data) {

    Node<T> newNode = new Node<>(data);
    newNode.setPrev(top);
    top = newNode;
    return newNode.getVal();
  }

  public T pop() {
    if (top == null) {
      throw new IllegalStateException("The Stack is empty");
    }
    Node<T> newNode = top;
    top = top.getPrev();
    return newNode.getVal();
  }

  public T peek() {
    if (top == null) {
      throw new IllegalStateException("Stack is empty");
    }
    return top.getVal();
  }
}
