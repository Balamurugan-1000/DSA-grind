class Node<T> {
  private Node<T> next;
  private Node<T> prev;
  private T value;

  public Node(T val) {
    this.value = val;

  }

  public Node<T> getNext() {
    return next;
  }

  public Node<T> getPrev() {
    return prev;
  }

  public T getValue() {
    return value;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }

  public void setPrev(Node<T> prev) {
    this.prev = prev;
  }

  public void setValue(T value) {
    this.value = value;
  }
}

public class DoublyLinklist<T> {
  int length;
  Node<T> head;
  Node<T> tail;

  public DoublyLinklist() {

    this.length = 0;
    this.head = null;
    this.tail = null;

  }

  public void prepend(T item) {
    Node<T> node = new Node<>(item);
    this.length++;
    if (this.head == null) {
      this.head = node;
      this.tail = node;
      return;
    }

    node.setNext(this.head);
    this.head.setPrev(node);
    this.head = node;

  }

  public void insertAt(T item, int index) {
    if (index > this.length) {
      throw new Error("The index is too big");
    } else if (index == this.length) {
      this.append(item);
      return;
    } else if (index == 0) {
      this.prepend(item);
      return;
    }
    this.length++;
    Node<T> curr = this.head;

    for (int i = 0; curr != null && i < index; i++) {
      curr = curr.getNext();
    }

    Node<T> node = new Node<>(item);
    node.setNext(curr);
    node.setPrev(curr.getPrev());

    if (curr.getPrev() != null) {
      curr.getPrev().setNext(node);
    } else {
      this.head = node; // Updating head if inserting at index 0
    }

    curr.setPrev(node);
    // NOTE: this is cool
    node.getNext().setPrev(node);
  }

  public void append(T item) {
    this.length++;

    Node<T> node = new Node<>(item);

    if (this.tail == null) {
      this.head = this.tail = node;
      return;
    }

    node.setPrev(this.tail);
    this.tail.setNext(node);
    this.tail = node;
  }

  public Node<T> get(int index) {

    Node<T> curr = this.head;

    for (int i = 0; i < index && curr != null; i++) {
      curr = curr.getNext();
    }

    return curr;

  }

  public void remove(T item) {

    Node<T> curr = this.head;

    for (int i = 0; i < this.length && curr != null; i++) {
      if (curr.getValue().equals(item))
        break;
      curr = curr.getNext();
    }

    if (curr == null)
      return;

    if (curr.getPrev() == null) {
      this.head = curr.getNext();
    } else
      curr.getPrev().setNext(curr.getNext());

    if (curr.getNext() != null) {
      curr.getNext().setPrev(curr.getPrev());
    }
    if (curr.getNext() == null) {
      this.tail = curr.getPrev();
    }

    this.length--;
  }

  public void removeAtIndex(int index) {
    Node<T> curr = this.head;
    for (int i = 0; i < index; i++) {
      if (curr == null)
        return; // If index is out of bounds
      curr = curr.getNext();
    }
    if (curr == null)
      return;

    if (curr == this.tail) {
      this.tail = curr.getPrev();
      if (this.tail != null)
        this.tail.setNext(null);
      return;
    }

    if (curr == this.head) {
      this.head = curr.getNext();
      if (this.head != null)
        this.head.setPrev(null);
      else
        this.tail = null;
      return;
    }

    curr.getPrev().setNext(curr.getNext());
    curr.getNext().setPrev(curr.getPrev());
  }

}
