import java.util.Scanner;

public class binarySearch {
  public static void main(String[] args) {
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++)
      arr[i] = sc.nextInt();

    int ans = binarySearchFunction(arr, 5);
    System.out.println(ans);
    sc.close();
  }

  public static int binarySearchFunction(int[] arr, int tar) {
    int low = 0, high = arr.length;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (arr[mid] == tar) {
        return mid;
      } else if (arr[mid] > tar)
        high = mid;
      else
        low = mid + 1;
    }
    return -1;
  }
}
