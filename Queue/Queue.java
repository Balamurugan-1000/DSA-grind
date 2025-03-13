class Node<T> {
  private T value;
  private Node<T> prev; // Correctly using generics

  public Node(T val) {
    this.value = val;
    this.prev = null;
  }

  // Optional: Getter methods for encapsulation
  public T getValue() {
    return value;
  }

  public Node<T> getPrev() {
    return prev;
  }

  public void setPrev(Node<T> prev) {
    this.prev = prev;
  }
}

public class Queue<T> {
  private Node<T> front;
  private Node<T> rear;

  public Queue() {
    this.front = null;
    this.rear = null;
  }

  // Enqueue operation
  public void enqueue(T item) {
    Node<T> newNode = new Node<>(item);
    if (rear == null) {
      front = rear = newNode;
    } else {
      rear.setPrev(newNode);
      rear = newNode;
    }
  }

  // Dequeue operation
  public T dequeue() {
    if (front == null)
      throw new IllegalStateException("Queue is empty!");
    T val = front.getValue();
    front = front.getPrev();
    if (front == null)
      rear = null; // If queue is empty after dequeue
    return val;
  }

  // Peek operation (get front element without removing)
  public T peek() {
    if (front == null)
      throw new IllegalStateException("Queue is empty!");
    return front.getValue();
  }

  // Check if the queue is empty
  public boolean isEmpty() {
    return front == null;
  }
}
