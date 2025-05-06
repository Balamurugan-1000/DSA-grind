public class URLify {
  public static void urlify(char[] str, int trueLength) {
    int spaceCount = 0;

    for (int i = 0; i < trueLength; i++) {
      if (str[i] == ' ') {
        spaceCount++;
      }
    }

    int newLength = trueLength + spaceCount * 2;
    int index = newLength - 1;
    for (int i = trueLength - 1; i >= 0; i--) {
      if (str[i] == ' ') {
        str[index--] = '0';
        str[index--] = '2';
        str[index--] = '%';
      } else {
        str[index--] = str[i];
      }
    }
  }

  public static void main(String[] args) {
    char[] input = new char[20];
    String str = "Mr John Smith";

    for (int i = 0; i < str.length(); i++) {
      input[i] = str.charAt(i);
    }

    urlify(input, str.length());

    System.out.println(new String(input));
  }
}
