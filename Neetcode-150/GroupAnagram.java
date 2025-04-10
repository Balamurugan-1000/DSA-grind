import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class GroupAnagram {

    public static List<List<String>> solution(String[] arr) {
        int[] count = new int[26];
        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (String string : arr) {
            Arrays.fill(count, 0);
            for (char a : string.toCharArray()) {
                count[a - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int c : count) {
                sb.append(c).append("#");
            }

            String key = sb.toString();

            // this is to add new if absent but more readable way
            hashMap.computeIfAbsent(key, k -> new ArrayList<>()).add(string);
        }

        for (List<String> group : hashMap.values()) {
            System.out.println(group);
        }

        return new ArrayList<>(hashMap.values());
    }

    public static void main(String[] args) {
        String[] str = { "eat", "ate", "bat", "tab", "tan", "nat" };
        solution(str);
    }
}
