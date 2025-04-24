import java.util.Arrays;

public class ProductArrayExceptItself {

  public static int[] product(int[] arr) {
    int pre = 1, post = 1;
    int[] ans = new int[arr.length];

    Arrays.fill(ans, 1);
    for (int i = 0; i < arr.length; i++) {

      System.out.println(Arrays.toString(ans));
      ans[i] = pre;
      pre = pre * arr[i];
    }

    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.println(Arrays.toString(ans));
      ans[i] *= post;
      post = post * arr[i];
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3 };

    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(product(arr)));
  }
}
