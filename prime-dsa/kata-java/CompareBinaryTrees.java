public class CompareBinaryTrees {

  public static <T> boolean compare(BinaryNode<T> a, BinaryNode<T> b) {

    // Case 1: both nodes are null → trees match
    if (a == null && b == null) {
      return true;
    }

    // Case 2: one is null but the other isn't → trees differ
    if (a == null || b == null) {
      return false;
    }

    // Case 3: values are different → trees differ
    if (!a.value.equals(b.value)) {
      return false;
    }

    // Case 4: recursively compare left and right subtrees
    return compare(a.left, b.left) && compare(a.right, b.right);
  }
}
