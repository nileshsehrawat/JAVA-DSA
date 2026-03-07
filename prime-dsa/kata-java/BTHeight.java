
class BinaryNode<T> {
  T value;
  BinaryNode<T> left;
  BinaryNode<T> right;

  BinaryNode(T value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }
}

public class BTHeight {

  public static int height(BinaryNode<Integer> root) {
    if (root == null) {
      return 0;
    }
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    return 1 + Math.max(leftHeight, rightHeight);
  }

  public static void main(String[] args) {
    BinaryNode<Integer> root = new BinaryNode<>(1);
    root.left = new BinaryNode<>(2);
    root.right = new BinaryNode<>(3);
    root.left.left = new BinaryNode<>(4);
    root.left.right = new BinaryNode<>(5);

    int treeHeight = height(root);

    System.out.println("Height of tree: " + treeHeight);
  }
}
