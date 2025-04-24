class Node<T> {
  private T val;
  private Node<T> next;

  public Node(T data) {
    this.val = data;
    this.next = null;

  }

  public T getVal() {
    return this.val;
  }

  public Node<T> getNext() {
    return this.next;
  }

  public void setNext(Node<T> data) {
    this.next = data;
  }
}

public class QueueTest<T> {

  Node<T> front;
  Node<T> rear;

  public QueueTest() {
    front = null;
    rear = null;
  }

  public Node<T> enqueue(T item) {
    Node<T> newNode = new Node<T>(item);
    if (rear == null) {
      front = rear = newNode;
      return newNode;
    }

    rear.setNext(newNode);
    rear = newNode;
    return newNode;

  }

  public Node<T> dequeue() {
    if (front == null) {
      throw new IllegalStateException("Queue is empty");
    }
    Node<T> firstTemp = front;
    front = front.getNext();
    if (front == null)
      rear = null;
    return firstTemp;
  }

  public T peek() {
    if (front == null) {
      throw new IllegalStateException("Queue is empty");
    }
    return front.getVal();
  }
}
