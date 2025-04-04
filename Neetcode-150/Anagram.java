import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

    public static boolean anagram(String s1, String s2) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        if (s1.length() != s2.length())
            return false;

        for (char a : s1.toCharArray()) {
            hashMap.put(a, (hashMap.getOrDefault(a, 0) + 1));
        }

        for (char a : s2.toCharArray()) {
            if (!hashMap.containsKey(a) || hashMap.get(a) == 0)
                return false;
            hashMap.put(a, (hashMap.getOrDefault(a, 0) - 1));
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();

        System.out.println(anagram(s1, s2));

    }
}
