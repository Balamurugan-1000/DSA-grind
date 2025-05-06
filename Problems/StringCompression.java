import java.util.Arrays;

public class StringCompression {

  public static int compress(char[] str) {
    int ptr = 0, count = 1;

    for (int i = 1; i < str.length; i++) {
      if (str[i] == str[i - 1]) {
        count++;
      } else {
        str[ptr++] = str[i - 1];
        if (count > 1) {
          // Convert count to string and then to char array to add each character
          for (char c : Integer.toString(count).toCharArray()) {
            str[ptr++] = c;
          }
        }
        count = 1; // Reset count
      }
    }

    str[ptr++] = str[str.length - 1];
    if (count > 1) {
      for (char c : Integer.toString(count).toCharArray()) {
        str[ptr++] = c;
      }
    }

    return ptr;
  }

  public static void main(String[] args) {
    String str = "abbccaac";
    char[] charArray = str.toCharArray();
    int ans = compress(charArray);

    // Output the compressed string array and its length
    System.out.println(Arrays.toString(charArray));
    System.out.println(ans); // This should print the length of the compressed string
  }
}
