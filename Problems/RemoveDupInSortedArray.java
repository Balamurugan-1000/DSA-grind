
public class RemoveDupInSortedArray {
  public static int remove(int[] str) {

    int ptr = 1;

    for (int i = 1; i < str.length; i++) {

      if (str[i] != str[i - 1]) {
        str[ptr] = str[i];
        ptr++;
      }
    }
    return ptr;
  }

  public static void main(String[] args) {

    int[] arr = { 1, 1, 2, 3, 4, 5, 5, 6, 6, 6, 6, 7 };
    int ans = remove(arr);
    System.out.println(ans);

    for (int i = 0; i < ans; i++) {
      System.out.println(arr[i]);
    }
  }
}
