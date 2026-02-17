import java.util.*;

public class MazeSolver {

  // Directions: up, down, left, right
  private static final int[][] DIRS = {
      { -1, 0 },
      { 1, 0 },
      { 0, -1 },
      { 0, 1 }
  };

  // Point class (equivalent to TS Point type)
  static class Point {
    int x;
    int y;

    Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public String toString() {
      return "(" + x + "," + y + ")";
    }
  }

  // Recursive DFS function
  private static boolean walk(
      String[] maze,
      char wall,
      Point curr,
      Point end,
      boolean[][] seen,
      List<Point> path) {

    // Base Case - Out of bounds
    if (curr.x < 0 || curr.x >= maze[0].length()
        || curr.y < 0 || curr.y >= maze.length) {
      return false;
    }

    // On a wall
    if (maze[curr.y].charAt(curr.x) == wall) {
      return false;
    }

    // Reached the end
    if (curr.x == end.x && curr.y == end.y) {
      path.add(new Point(curr.x, curr.y));
      return true;
    }

    // Already visited
    if (seen[curr.y][curr.x]) {
      return false;
    }

    // ---- PRE (before recursion) ----
    seen[curr.y][curr.x] = true;
    path.add(new Point(curr.x, curr.y));

    // Explore neighbors (recursive step)
    for (int[] dir : DIRS) {
      int newX = curr.x + dir[0];
      int newY = curr.y + dir[1];

      if (walk(maze, wall,
          new Point(newX, newY),
          end, seen, path)) {
        return true;
      }
    }

    // ---- POST (backtracking) ----
    path.remove(path.size() - 1);

    return false;
  }

  // Solve function
  public static List<Point> solve(
      String[] maze,
      char wall,
      Point start,
      Point end) {

    boolean[][] seen = new boolean[maze.length][maze[0].length()];
    List<Point> path = new ArrayList<>();

    walk(maze, wall, start, end, seen, path);

    return path;
  }

  // Test
  public static void main(String[] args) {

    String[] maze = {
        "S  X",
        " XX ",
        "    ",
        "X XX"
    };

    Point start = new Point(0, 0);
    Point end = new Point(3, 2);

    List<Point> path = solve(maze, 'X', start, end);

    System.out.println(path);
  }
}
