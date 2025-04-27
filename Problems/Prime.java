import java.util.Arrays;

public class prime {

  public static boolean isPrime(int n) {
    if (n <= 1)
      return false;
    for (int i = 2; i * i <= n; i++) {

      if (n % i == 0)
        return false;
    }
    return true;
  }

  public static void primeOptimized(int n) {
    boolean[] bool = new boolean[n + 1];
    Arrays.fill(bool, true);
    bool[0] = false;
    bool[1] = false;
    for (int i = 2; i * i <= n; i++) {
      if (bool[i]) {
        for (int j = i * i; j <= n; j += i) {
          bool[j] = false;
        }
      }
    }
    for (int i = 2; i <= n; i++) {
      if (bool[i]) {
        System.out.println(i);
      }
    }
  }

  public static void main(String[] args) {
    int num = 100;
    // ArrayList<Integer> arrayList = new ArrayList<>();

    primeOptimized(num);

    // for (int i = 2; i <= num; i++) {
    // if (isPrime(i)) {
    // arrayList.add(i);
    // }
    // }
    //
    // for (int i = 0; i < arrayList.size(); i++) {
    // System.out.println(arrayList.get(i));
    // }
  }
}

