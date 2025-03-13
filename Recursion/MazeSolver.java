import java.util.Stack;

class Point {
  int x, y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

public class MazeSolver {

  static char[][] maze = {
      { ' ', ' ', ' ', ' ', 'X' },
      { 'X', 'X', ' ', 'X', 'X' },
      { ' ', ' ', ' ', ' ', ' ' },
      { 'X', ' ', 'X', 'X', ' ' },
      { ' ', ' ', ' ', 'X', ' ' }
  };

  static Point start = new Point(0, 0); // Start position (row, col)
  static Point end = new Point(4, 4); // End position (row, col)
  static boolean[][] seen = new boolean[maze.length][maze[0].length];
  static Stack<Point> st = new Stack<>();

  public static boolean walk(int x, int y) {

    Point curr = new Point(x, y);
    if (x < 0 || y < 0 || x >= maze.length || y >= maze[0].length)
      return false;

    if (maze[x][y] == 'X' || seen[x][y])
      return false;
    if (x == end.x && y == end.y)
      return true;
    st.push(curr);
    seen[x][y] = true;

    if (walk(x - 1, y) || walk(x + 1, y) || walk(x, y - 1) || walk(x, y + 1)) {
      return true;
    }
    st.pop();
    return false;
  }

  public static void main(String[] args) {

    boolean findEnd = walk(start.x, start.y);
    System.out.println("Path found : " + findEnd);
  }

}
