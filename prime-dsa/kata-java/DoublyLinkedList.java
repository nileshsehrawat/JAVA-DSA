public class DoublyLinkedList<T> {

  // Inner Node class
  private static class Node<T> {
    T value; // stores the actual data
    Node<T> next; // pointer to next node
    Node<T> prev; // pointer to previous node

    Node(T value) {
      this.value = value; // assign value to node
    }
  }

  private Node<T> head; // first node in list
  private Node<T> tail; // last node in list
  private int length; // keeps track of number of elements (bookkeeping)

  public DoublyLinkedList() {
    this.head = null; // initially list is empty
    this.tail = null; // no tail
    this.length = 0; // size starts at 0
  }

  // ---------------- PREPEND ----------------
  public void prepend(T item) {

    Node<T> node = new Node<>(item); // create new node with value

    length++; // bookkeeping: increase size because we are adding one element

    if (head == null) { // if list is empty
      head = tail = node; // head and tail both point to this node
      return; // done
    }

    node.next = head; // new node points forward to old head
    head.prev = node; // old head points back to new node
    head = node; // move head pointer to new node
  }

  // ---------------- APPEND ----------------
  public void append(T item) {

    Node<T> node = new Node<>(item); // create new node

    length++; // bookkeeping: increase size

    if (tail == null) { // if list is empty
      head = tail = node; // both head and tail point to node
      return;
    }

    tail.next = node; // old tail points forward to new node
    node.prev = tail; // new node points back to old tail
    tail = node; // move tail pointer forward
  }

  // ---------------- INSERT AT INDEX ----------------
  public void insertAt(T item, int idx) {

    if (idx < 0 || idx > length) { // invalid index
      throw new IndexOutOfBoundsException();
    }

    if (idx == 0) { // if inserting at beginning
      prepend(item); // reuse prepend logic
      return;
    }

    if (idx == length) { // if inserting at end
      append(item); // reuse append logic
      return;
    }

    Node<T> curr = head; // start from head

    for (int i = 0; i < idx; i++) { // move to position
      curr = curr.next; // go forward
    }

    Node<T> node = new Node<>(item); // create new node

    length++; // bookkeeping: size increases

    node.next = curr; // new node points forward to curr
    node.prev = curr.prev; // new node points back to curr's previous

    curr.prev.next = node; // previous node now points forward to new node
    curr.prev = node; // curr now points back to new node
  }

  // ---------------- GET BY INDEX ----------------
  public T get(int idx) {

    if (idx < 0 || idx >= length) { // invalid index
      return null;
    }

    Node<T> curr = head; // start from head

    for (int i = 0; i < idx; i++) { // move forward idx times
      curr = curr.next;
    }

    return curr.value; // return data stored at that node
  }

  // ---------------- REMOVE AT INDEX ----------------
  public T removeAt(int idx) {

    if (idx < 0 || idx >= length) { // invalid index
      return null;
    }

    if (idx == 0) { // removing head
      T val = head.value; // store value

      head = head.next; // move head forward

      if (head != null) {
        head.prev = null; // remove backward pointer
      } else {
        tail = null; // list became empty
      }

      length--; // bookkeeping: size decreases
      return val;
    }

    Node<T> curr = head;

    for (int i = 0; i < idx; i++) { // move to target node
      curr = curr.next;
    }

    T val = curr.value; // store value

    curr.prev.next = curr.next; // bypass current node forward
    if (curr.next != null) {
      curr.next.prev = curr.prev; // bypass current node backward
    } else {
      tail = curr.prev; // if removing last element, move tail back
    }

    length--; // bookkeeping: decrease size

    return val;
  }

  public int size() {
    return length; // return current size
  }
}
