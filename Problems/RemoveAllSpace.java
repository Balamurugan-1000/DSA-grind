/**
 * RemoveAllSpace
 */
public class RemoveAllSpace {
  public static String remove(char[] str) {
    int ptr = 0, space = 0;
    for (int i = 0; i < str.length; i++) {
      if (str[i] == ' ')
        space++;
    }

    int total = str.length - space;
    for (int i = 0; i < str.length; i++) {
      if (str[i] != ' ') {
        str[ptr] = str[i];
        ptr++;
      }
    }

    for (int i = total; i < str.length; i++) {
      str[i] = ' ';
    }
    return new String(str).trim();

  }

  public static void main(String[] args) {

    String sc = "H e llo";
    System.out.println(remove(sc.toCharArray()));
  }
}
