import java.util.ArrayList;
import java.util.List;

public class BTPreOrder {
  public static <T> List<T> preorder(BinaryNode<T> root) {
    List<T> result = new ArrayList<>();
    walkPre(root, result);
    return result;
  }

  public static <T> void walkPre(BinaryNode<T> curr, List<T> path) {
    if (curr == null)
      return; // base case

    path.add(curr.value); // PRE (visit root node first)

    walkPre(curr.left, path); // go left
    walkPre(curr.right, path); // go right

  }

  public static void main(String[] args) {

    BinaryNode<Integer> root = new BinaryNode<>(1);
    root.left = new BinaryNode<>(2);
    root.right = new BinaryNode<>(3);
    root.left.left = new BinaryNode<>(4);
    root.left.right = new BinaryNode<>(5);

    List<Integer> result = preorder(root);

    System.out.println(result);
  }
}
