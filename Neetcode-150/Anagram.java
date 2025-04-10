import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

    public static boolean anagram(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        if (s.length() != t.length())
            return false;

        for (char a : s.toCharArray()) {
            hashMap.put(a, (hashMap.getOrDefault(a, 0) + 1));
        }

        for (char a : t.toCharArray()) {
            if (!hashMap.containsKey(a) || hashMap.get(a) == 0)
                return false;
            hashMap.put(a, (hashMap.getOrDefault(a, 0) - 1));
        }

        // Online version (Mostly same) But only work on a-z and if modified A-Z and it
        // has to be memory heavy if its for all unicode values

        // int[] charCount = new int[26];
        //
        // for (int i = 0; i < s.length(); i++) {
        // charCount[s.charAt(i)]++;
        // charCount[t.charAt(i)]--;
        // }
        // for (int i : charCount) {
        // if (i != 0)
        // return false;
        // }
        return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();

        System.out.println(anagram(s, t));

    }
}
