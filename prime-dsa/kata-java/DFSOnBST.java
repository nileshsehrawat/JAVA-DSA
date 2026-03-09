public class DFSOnBST {

  public static boolean dfs(BinaryNode<Integer> root, int needle) {
    return search(root, needle);
  }

  public static boolean search(BinaryNode<Integer> curr, int needle) {
    // Base case : reaching end of a branch
    if (curr == null) {
      return false;
    }
    // Found the node
    if (curr.value == needle) {
      return true;
    }
    // If current calue is smaller go to right
    if (curr.value < needle) {
      return search(curr.right, needle);
    }
    // otherwise go to left
    return search(curr.left, needle);
  }
}
