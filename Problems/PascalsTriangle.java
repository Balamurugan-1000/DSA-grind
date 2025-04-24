import java.util.ArrayList;
import java.util.Arrays;

public class PascalsTriangle {

  public static ArrayList<Integer> ncr(int n) {

    ArrayList<Integer> aList = new ArrayList<>();
    int ans = 1;
    for (int i = 0; i <= n; i++) {
      aList.add(ans);
      ans *= (n - i);
      ans /= (i + 1);

    }

    return aList;
  }

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> pascals = new ArrayList<>();

    for (int i = 0; i < 7; i++) {
      pascals.add(ncr(i));
    }

    System.out.println(Arrays.toString(pascals.toArray()));
  }
}
