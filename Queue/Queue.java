class Node<T> {
  private T value;
  private Node<T> next; // Use next instead of prev

  public Node(T val) {
    this.value = val;
    this.next = null;
  }

  public T getValue() {
    return value;
  }

  public Node<T> getNext() { // Changed to getNext()
    return next;
  }

  public void setNext(Node<T> next) { // Changed to setNext()
    this.next = next;
  }
}

public class Queue<T> {
  private Node<T> front;
  private Node<T> rear;

  public Queue() {
    this.front = null;
    this.rear = null;
  }

  // Enqueue operation (adds to the rear)
  public void enqueue(T item) {
    Node<T> newNode = new Node<>(item);
    if (rear == null) {
      front = rear = newNode;
    } else {
      rear.setNext(newNode); // Fix: Use setNext() instead of setPrev()
      rear = newNode;
    }
  }

  // Dequeue operation (removes from the front)
  public T dequeue() {
    if (front == null)
      throw new IllegalStateException("Queue is empty!");
    T val = front.getValue();
    front = front.getNext(); // Fix: Move to next node
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
