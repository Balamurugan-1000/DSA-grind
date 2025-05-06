import java.util.Arrays;

public class MoveAllZerosToEnd {
  public static int[] move(int[] arr) {

    int ptr = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        arr[ptr] = arr[i];
        ptr++;
      }
    }
    for (int i = ptr; i < arr.length; i++) {
      arr[i] = 0;
    }

    return arr;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 0, 1, 0, 4, 5, 0 };

    System.out.println(Arrays.toString(move(arr)));

  }
}
