import java.util.Queue;
import java.util.LinkedList;

public class BTBFS {
  public static boolean bfs(BinaryNode<Integer> root, int target) {
    if (root == null)
      return false;

    Queue<BinaryNode<Integer>> q = new LinkedList<>();
    q.offer(root); // add to queue

    while (!q.isEmpty()) {
      BinaryNode<Integer> curr = q.poll(); // remove form queue

      if (curr.value == target)
        return true;

      if (curr.left != null)
        q.offer(curr.left);

      if (curr.right != null)
        q.offer(curr.right);
    }

    return false;
  }
}
