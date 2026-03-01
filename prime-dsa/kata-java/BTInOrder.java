import java.util.ArrayList;
import java.util.List;

public class BTInOrder {

  public static <T> List<T> inorder(BinaryNode<T> root) {
    List<T> result = new ArrayList<>();
    walkIn(root, result);
    return result;
  }

  public static <T> void walkIn(BinaryNode<T> curr, List<T> path) {
    if (curr == null)
      return;

    walkIn(curr.left, path); // left first

    path.add(curr.value); // visit root

    walkIn(curr.right, path); // then right
  }
}
