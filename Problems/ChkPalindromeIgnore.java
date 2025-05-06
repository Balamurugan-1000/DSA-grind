public class ChkPalindromeIgnore {

  public static boolean check(String str) {

    int left = 0, right = str.length() - 1;

    while (left < right) {
      while (left < right && !Character.isLetterOrDigit(str.charAt(left)))
        left++;

      while (left < right && !Character.isLetterOrDigit(str.charAt(right)))
        right--;

      if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right)))
        return false;

      left++;
      right--;
    }

    return true;
  }

  public static void main(String[] args) {

    System.out.println(check("this is si sihT"));
  }
}
