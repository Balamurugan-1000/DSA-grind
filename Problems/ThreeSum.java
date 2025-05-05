import java.util.Arrays;

public class ThreeSum {

  public static int[][] findThree(int[] arr) {
    int n = arr.length;
    int[][] ans = new int[n* n][];
    int ptr = 0;

    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        for (int k = j; k < n; k++) {
          if (arr[i] != arr[j] && arr[j] != arr[k]) {
            if (arr[i] + arr[j] + arr[k] == 0) {
                        ans[ptr] = new int[3]; // ✅ Initialize inner array
              ans[ptr][0] = arr[i];
              ans[ptr][1] = arr[j];
              ans[ptr][2] = arr[k];
              ptr++;
            }
          }
        }
      }
    }

  return Arrays.copyOf(ans, ptr);
  }

  public static void main(String[] args) {

    int[] array = { 1, 2, -1, -2, 0 };

    int[][] ans = findThree(array);

    for (int[] row : ans) {
      for (int num : row) {
        System.out.print(num + " "); // Add a space between numbers
      }
      System.out.println(); // Move to the next line after printing a row
    }
  }
}
