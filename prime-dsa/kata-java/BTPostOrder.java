import java.util.ArrayList;
import java.util.List;

public class BTPostOrder {
  public static <T> List<T> postorder(BinaryNode<T> root) {
    List<T> result = new ArrayList<>();
    walkPost(root, result);
    return result;
  }

  public static <T> void walkPost(BinaryNode<T> curr, List<T> path) {
    if (curr == null)
      return; // base case

    walkPost(curr.left, path); // PRE- go left
    walkPost(curr.right, path); // RECURCE- go right

    path.add(curr.value); // POST (visit root node first)
  }

  public static void main(String[] args) {

    BinaryNode<Integer> root = new BinaryNode<>(1);
    root.left = new BinaryNode<>(2);
    root.right = new BinaryNode<>(3);
    root.left.left = new BinaryNode<>(4);
    root.left.right = new BinaryNode<>(5);

    List<Integer> result = postorder(root);

    System.out.println(result);
  }
}
