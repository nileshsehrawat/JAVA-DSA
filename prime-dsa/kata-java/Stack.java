
public class Stack<T> {

  private static class Node<T> {
    T value;
    Node<T> prev;

    Node(T value) {
      this.value = value;
    }
  }

  private Node<T> head;
  private int length;

  public Stack() {
    this.head = null;
    this.length = 0;
  }

  public void push(T item) {

    Node<T> node = new Node<>(item);
    length++;

    if (head == null) {
      head = node;
      return;
    }

    node.prev = head;
    head = node;
  }

  public T pop() {
    if (head == null) {
      return null;
    }

    length--;

    Node<T> temp = head;
    head = head.prev;

    temp.prev = null; // optional cleanup

    return temp.value;
  }

  public T peek() {
    if (head == null) {
      return null;
    }

    return head.value;
  }

  public int size() {
    return length;
  }

  public static void main(String[] args) {

    Stack<Integer> stack = new Stack<>();

    stack.push(10);
    stack.push(20);
    stack.push(30);

    System.out.println(stack.pop()); // 30
    System.out.println(stack.peek()); // 20
    System.out.println(stack.size()); // 2
  }
}
