public class Queue<T> {

  private static class Node<T> {
    T value;
    Node<T> next;

    Node(T value) {
      this.value = value;
    }
  }

  private Node<T> head;
  private Node<T> tail;
  private int length;

  public Queue() {
    this.head = null;
    this.tail = null;
    this.length = 0;
  }

  // enqueue
  public void enqueue(T item) {
    Node<T> node = new Node<>(item);
    length++;

    if (tail == null) {
      head = tail = null;
      return;
    }
    tail.next = node;
    tail = node;
  }

  // dequeue
  public T dequeue() {

    if (head == null) {
      return null;
    }
    length--;

    Node<T> temp = head;
    head = head.next;

    // if queue becomes empty
    if (head == null) {
      tail = null;
    }
    ;

    temp.next = null; // optional cleanup

    return temp.value;
  }

  // peek
  public T peek() {
    if (head == null) {
      return null;
    }
    return head.value;
  }

  public int size() {
    return length;
  }

}
